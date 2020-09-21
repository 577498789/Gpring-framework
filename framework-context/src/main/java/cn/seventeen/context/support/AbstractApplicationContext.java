package cn.seventeen.context.support;

public class AbstractApplicationContext implements ApplicationContext{

    private Environment environment;

    private BeanFactory beanFactory;

    private MessageResource messageResource;

    public Environment getEnvironment() {
        return null;
    }

    public void setEnvironment(Environment environment) {

    }

    public BeanFactory getBeanFactory() {
        return null;
    }

    /**
     * 该方法就是程序上下文的初始化方法
     * 该方法定义了一套初始化程序上下文的流程
     * 1、初始化程序必要组件Environment，准备环境，即扫描配置文件
     * 2、初始化程序必要组件，MessageResource
     * 3、初始化程序必要组件，BeanFactory，准备开始装配bean
     * 4、调用bean工厂后置处理方法对bean开始装配，
     * 5、提供一个钩子方法，允许子类对其实现，以适应不同的子类的不同需求，添加其特殊的组件
     * 6、对bean后置处理bean进行实装，为待会对bean初始化做准备
     * 7、初始化单例，并且非懒加载的bean
     * 8、发布程序事件
     */
    public final void initial() {


    }

}
