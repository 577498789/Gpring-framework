package cn.seventeen.bean.factory;

public interface HierarchicalBeanFactory extends BeanFactory {

    //返回本Bean工厂的父工厂
    BeanFactory getParentBeanFactory();

    //本地工厂是否包含这个Bean
    boolean containsLocalBean(String name);


}
