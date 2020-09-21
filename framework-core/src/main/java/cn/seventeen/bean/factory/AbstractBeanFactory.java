package cn.seventeen.bean.factory;

import cn.seventeen.bean.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractBeanFactory implements BeanFactory {

    //编号
    private String Numbering = "";
    //
    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<String, BeanDefinition>();
    //单例池
    private final Map<Class, Object> simplePool = new HashMap<Class, Object>();
    //
    private final Map<String, Class> classMap = new HashMap<String, Class>();
    //
    private final Map<String, String> initTypeMap = new HashMap<String, String>();

    //获取一个bean
    public Object getBean(String beanName) {

        return null;
    }

    //通过bean类型获取一个bean
    public Object getBean(Class clazz){
        return null;
    }

    //通过bean的名字和bean的类型获取指定bean
    public Object getBean(String beanName,Class clazz){
        return null;
    }

    public boolean containBean(String beanName) {
        return false;
    }

    public boolean isSingle() {
        return false;
    }

    public boolean isAbstract() {
        return false;
    }

    public boolean isTypeMatch() {
        return false;
    }

    public Class getClazz(String beanName) {
        return null;
    }


}
