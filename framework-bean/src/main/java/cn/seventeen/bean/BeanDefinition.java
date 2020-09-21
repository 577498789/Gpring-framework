package cn.seventeen.bean;

/**
 * bean的定义器接口，
 * 作为一个bean的定义器必须满足以下条件
 * 1.设置和获取bean的类型
 * 2.设置和获取bean的名字
 * 3.设置和获取bean的作用域
 * 4.设置和获取bean的加载方式
 * 5.
 */
public interface BeanDefinition {

    //作用域 单例
    public static final String SCOPE_SINGLE="single";

    //作用域 原型
    public static final String SCOPE_PROTOTYPE="prototype";

    //初始化类型 懒加载
    public static final String INIT_LAZY="lazy";

    //初始化类型 不懒加载
    public static final String INIT_LAZYNO="lazyno";

    //设置bean的类型
    public abstract void setBeanClass(Class beanClass);

    //获取bean的类型
    public abstract Class getBeanClass();

    //设置bean的名字
    public abstract void setBeanName(String beanName);

    //获取bean的名字
    public abstract String getBeanName();

    //设置bean的作用域
    public abstract void setScope(String scope);

    //获取bean的作用域
    public abstract String getScope();

    //设置bean的初始化方式
    public abstract void setInitializeType(String initializeType);

    //获取bean的初始化方式
    public abstract String getInitializeType();

}
