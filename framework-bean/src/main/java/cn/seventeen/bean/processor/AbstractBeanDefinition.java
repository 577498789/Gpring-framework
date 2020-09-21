package cn.seventeen.bean.processor;

import cn.seventeen.bean.BeanDefinition;

public class AbstractBeanDefinition implements BeanDefinition {

    //bean的名称
    private String beanName;
    //bean的类型
    private Class beanClass;

    private String initializeType;

    private String scope;

    public String getBeanName() {
        return beanName;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public String getInitializeType() {
        return initializeType;
    }

    public String getScope() {
        return scope;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public void setInitializeType(String initializeType) {
        this.initializeType = initializeType;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
