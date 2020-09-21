package cn.seventeen.context.support;

import cn.seventeen.bean.factory.BeanFactory;
import cn.seventeen.bean.factory.DefaultListableBeanFactory;
import cn.seventeen.bean.factory.error.BeanFactoryTypeMismatchException;
import cn.seventeen.context.util.ApplicationContextLoggerUtil;
import cn.seventeen.core.env.Environment;
import cn.seventeen.core.resource.MessageResource;

import java.util.Date;

/**
 * ApplicationContext作为一个容器类，聚合多个组件
 * 而通过继承我们可以形成一种类似类加载器的模式
 * 上层无法访问下层，则父类无法访问子类的模式
 * 将多个组件分层，例如BeanFactory并不需要知道其他组件的存在
 * 则将BeanFactory设计在父类层
 * 其他组件设计在其子类层，这样的模式
 *
 * 但是
 * 这里由于本人对具体层次概念不是很了解
 * 所以暂时将所有的组件都统一在这一层
 *
 * 这种方式不仅可以进行分层，还能使臃肿的类变得轻便
 * （注：以上钧属于个人理解）
 */
public abstract class AbstractApplicationContext implements ApplicationContext{

    private long startupDate;

    private Environment environment;

    private BeanFactory beanFactory;

    private MessageResource messageResource;

    public Environment getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public BeanFactory getBeanFactory() {
        return this.beanFactory;
    }

    public MessageResource getMessageResource(){
        return this.messageResource;
    }

    public void setMessageResource(MessageResource messageResource){
        this.messageResource = messageResource;
    }

    /**
     * 无参构造，默认为beanFactory注入一个新的DefaultListableBeanFactory对象
     */
    public AbstractApplicationContext(){
        super();
        this.beanFactory = new DefaultListableBeanFactory();
    }


    /**
     * ApplicationContext允许由外部直接注入bean工厂的方式初始化
     * 但是注入的BeanFactory必须为DefaultListableBeanFactory类型
     * @param beanFactory
     *
     * 如果类型不匹配则会抛出此异常
     * @throws BeanFactoryTypeMismatchException
     */
    public AbstractApplicationContext(BeanFactory beanFactory) throws BeanFactoryTypeMismatchException{

        if(beanFactory instanceof DefaultListableBeanFactory){
            this.beanFactory = beanFactory;
        }else {
            ApplicationContextLoggerUtil.loggerPrint("The injected BeanFactory type does not comply with the regulations, it should be DefaultListableBeanFactory");
            throw new BeanFactoryTypeMismatchException();
        }

    }

    /**
     * 该方法就是程序上下文的初始化方法
     * 该方法定义了一套初始化程序上下文的流程
     * 1、初始化程序必要组件Environment，准备环境，即扫描配置文件
     * 2、获取bean工厂，此时bean工厂应为空，所以，实例化bean工厂
     * 3、刷新bean工厂
     * 4、初始化程序必要组件，BeanFactory，准备开始装配bean
     * 5、调用bean工厂后置处理方法对bean开始装配，
     * 6、初始化程序必要组件，MessageResource
     * 7、提供一个钩子方法，允许子类对其实现，以适应不同的子类的不同需求，添加其特殊的组件
     * 8、对bean后置处理bean进行实装，为待会对bean初始化做准备
     * 9、初始化单例，并且非懒加载的bean
     * 10、发布程序事件
     */
    public final void initial() throws RuntimeException{

        //1、初始化程序必要组件Environment，准备环境，即扫描配置文件
        prepareRefresh();

        //2、获取bean工厂
        DefaultListableBeanFactory beanFactory = obtainBeanFactory();

        //必要
        //3、准备bean工厂,将后面要用的关键组件注册到bean工厂
        prepareBeanFactory(beanFactory);

        //4、在bean工厂准备好后，对它做一些操作
        postProcessBeanFactory();

        //必要
        //5、调用bean工厂后置处理方法对bean开始装配
        invokeBeanFactoryPostProcessors(beanFactory);

        //6、初始化程序必要组件，MessageResource
        initMessageResource();

        //7、提供一个钩子方法，允许子类对其实现，以适应不同的子类的不同需求，添加其特殊的组件
        onRefresh();

        //必要
        //8、对bean后置处理bean进行实装，为待会对bean初始化做准备
        registerBeanPostProcessors(beanFactory);

        //必要
        //9、初始化单例，并且非懒加载的bean
        finishBeanFactoryInitialization(beanFactory);

        //10、发布程序事件
        finishRefresh();

    }

    /**
     * 此方法为程序初始化做准备，
     * 其中，应为初始化应用程序的方式不同，
     * 所需要的的配置也不同
     * 因此实际的初始化功能交给子类实现
     * initPropertySources();
     */
    protected void prepareRefresh(){

        //记录程序启动时间
        this.startupDate = System.currentTimeMillis();

        //日志打印


        //初始化某些参数
        initPropertySources();

    }

    //初始化程序配置，及其扫描配置文件，交由子类完成
    protected abstract void initPropertySources();

    //获取bean工厂
    protected DefaultListableBeanFactory obtainBeanFactory(){

        //如果已存在bean工厂，则清除它，否则可能会导致程序出错
        if(hasBeanFactory()){
            //清空bean

            //关闭bean工厂

        }
        try{

        }catch (Exception e){

        }
        return (DefaultListableBeanFactory) beanFactory;

    }

    //判断是否有bean工厂
    protected boolean hasBeanFactory(){

        if(this.beanFactory==null){
            return false;
        }else{
            return true;
        }

    }

    /**
     * 准备bean工厂,将后面要用的关键组件注册到bean工厂
     */
    protected void prepareBeanFactory(DefaultListableBeanFactory beanFactory){
        
    }

    /**
     * 在bean工厂准备完成后，
     * 对其注入某些特殊的bean工厂后置处理器
     * 该方法为抽象方法，具体实现交给子类
     */
    protected abstract void postProcessBeanFactory();

    /**
     * 将bean注册到注册表中，
     * 之后将回调所有工厂处理器的后置处理方法
     * @param beanFactory
     */
    protected void invokeBeanFactoryPostProcessors(DefaultListableBeanFactory beanFactory){

    }

    /**
     * 初始化消息源
     */
    protected void initMessageResource(){

    }

    /**
     * 提供一个钩子方法，允许子类对其实现，
     * 以适应不同的子类的不同需求，添加其特殊的组件
     */
    protected abstract void onRefresh();

    /**
     * 对bean后置处理bean进行实装，为待会对bean初始化做准备
     * @param beanFactory
     */
    protected void registerBeanPostProcessors(DefaultListableBeanFactory beanFactory){

    }

    /**
     * 初始化单例并且非懒加载的bean
     * @param beanFactory
     */
    protected void finishBeanFactoryInitialization(DefaultListableBeanFactory beanFactory){

    }

    /**
     * 发布程序事件
     */
    protected void finishRefresh(){

    }

}