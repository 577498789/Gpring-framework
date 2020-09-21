package cn.seventeen.bean.factory;

import java.util.Map;

/**
 * 此接口主要用于做一些常用查询
 * 该接口内定义的方法全部都是常用的查询方法
 * 该接口内部含有三组方法
 * 第一组为1、2、3，返回bean工厂的信息
 * 第二组为4、5，与类型相关的查询
 * 第三组为6、7、8，与注解相关的查询
 */
public interface ListableBeanFactory extends BeanFactory {

    /**
     * 用来返回工厂中的Bean的数目
     * @return
     */
    public abstract int getBeanDefinitionCount();


    /**
     * 用来检索工厂中是否包含某个Bean
     * 不考虑父子工厂
     * @param beanName 检索bean的名称
     * @return  返回一个boolean类型，true则存在
     */
    public abstract boolean containsBeanDefinition(String beanName);

    /**
     * 用来返回工厂中所有Bean的名称
     * 不考虑父子工厂
     * @return
     */
    public abstract String[] getBeanDefinitionNames();

    /**
     * 返回工厂中所有类型与给定类型一致的Bean的名字,
     * 包括了给定类型的子类或实现类
     * 不考虑父子工厂，只返回当前工厂的bean
     * @param type 需求的类型
     * @return
     */
    public abstract String[] getBeanNamesForType(Class type);

    /**
     * 返回工厂中所有类型与给定类型一致的Bean的实例,
     * 包括了给定类型的子类和实现类
     * @param type
     * @return
     */
    public abstract <T> Map<String,T> getBeansOfType(Class<T> type);

    /**
     * 这个函数是4.0开始引入的,
     * 主要用于寻找那些已经应用了注解,
     * 并且还没创建相应实例的Bean.对于那些由FactoryBean创建的对象,
     * 他们的类型则是在FactoryBean对其初始化的时候决定的.
     * @return
     */
    public abstract String[] getBeanNamesForAnnotation();

    /**
     * 这个函数是3.0开始引入的,
     * 这个接口与上一个函数是互补的,
     * 他主要用于寻找那些也能管用了注解,
     * 并且已经创建了相应实例的Bean,
     * 返回的是Bean的名称和他们的实例.FactoryBean所创建的对象,
     * 处理方式与getBeanNameForAnnotation相同.
     * @return
     */
    public abstract String getBeansWithAnnotation();

    /**
     * 这个函数也是3.0开始引入的,
     * 主要用于寻找指定类上所具备的某一种特定的注解,
     * 如果给定的那个Bean没有,就会寻找给定bean的父类或者给定Bean所实现的接口上是否有某一种特定的注解
     * 如果有,就返回.
     * @return
     */
    public abstract boolean findAnnotationOnBean();

}
