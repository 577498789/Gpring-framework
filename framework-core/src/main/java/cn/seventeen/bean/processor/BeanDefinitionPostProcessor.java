package cn.seventeen.bean.processor;

import cn.seventeen.bean.factory.BeanFactory;

/**
 * bean定义的后置处理器，
 * 该接口只有一个方法
 * postProcessAfterInitialization
 * 在bean被实例化后对其进行操作
 */
public interface BeanDefinitionPostProcessor {

    /**
     *
     * @param beanFactory
     */
    void postProcessAfterInitialization(BeanFactory beanFactory);

}
