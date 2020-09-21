package cn.seventeen.bean.factory;

/**
 * bean的工厂，用于管理bean，
 * 此接口规定一个bean工程必须拥有的职能
 * 1.获取一个bean
 * 2.判断一个bean是否存在工厂内部
 * 3.判断某个bean是否是单例
 * 4.判断一个bean是否为抽象
 * 5.判断一个bean是否是匹配的类型
 * 6.获得一个bean的类型
 *
 */
public interface BeanFactory {

    //获取一个bean
    public abstract Object getBean(String beanName);

    //通过bean类型获取一个bean
    public abstract Object getBean(Class clazz);

    //通过bean的名字和bean的类型获取指定bean
    public abstract  Object getBean(String beanName,Class clazz);

    //判断一个bean是否存在工厂内部
    public abstract boolean containBean(String beanName);

    //判断某个bean是否为单例
    public abstract boolean isSingle();

    //判断一个bean是否是抽象
    public abstract boolean isAbstract();

    //判断一个bean是否为匹配类型
    public abstract boolean isTypeMatch();

    //获得一个bean的类型
    public abstract Class getClazz(String beanName);


}
