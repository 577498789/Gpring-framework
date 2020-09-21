package cn.seventeen.bean.factory;

import cn.seventeen.bean.BeanDefinition;

/**
 * 该类主要用于提供一个注册bean的功能
 */
public interface BeanDefinitionRegister {

    /**
     * 关键 -> 往注册表中注册一个新的 BeanDefinition 实例
     * @param beanName  注册bean的名称
     * @param beanDefinition 注册bean的定义信息
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    /**
     *  移除注册表中已注册指定beanName的 BeanDefinition 实例
     * @param beanName 移除bean的名称
     */
    void removeBeanDefinition(String beanName);

    /**
     * 从注册中心取得指定beanName的 BeanDefinition 实例
     * @param beanName 获取的bean的名称
     * @return
     */
    BeanDefinition getBeanDefinition(String beanName);

    /**
     * 判断给定beanName的BeanDefinition 实例是否在注册表中（是否注册）
     * @param beanName 查找的bean的名称
     * @return
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 取得注册表中所有 BeanDefinition 实例的 beanName（标识）
     * @return
     */
    String[] getBeanDefinitionNames();

    /**
     * 返回注册表中 BeanDefinition 实例的数量
     * @return
     */
    int getBeanDefinitionCount();

    /**
     * beanName（标识）是否被占用
     * @param beanName
     * @return
     */
    boolean isBeanNameInUse(String beanName);

}
