package cn.seventeen.bean.factory.processor;

/**
 * bean工厂的后置处理器
 * 有两个方法
 * 1.在bean工厂实例化前对其进行操作
 * 2.在bean工厂实例化后对其进行操作
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在bean工厂初始化完成前对其进行一定的操作，
     * 对工厂里面的bean进行修改
     * @param bean bean的实例，
     * @param beanName bean的名字
     * @return 返回值将作为该bean的新值
     */
    Object postProcessBeforeInitialization(Object bean, String beanName);

    /**
     * 在bean工厂初始化后对其进行一定的操作
     * 对工厂里面的bean进行修改
     * @param bean bean的实例
     * @param beanName bean的名称
     * @return 返回值将会作为bean的新值
     */
    Object postProcessAfterInitialization(Object bean, String beanName);

}
