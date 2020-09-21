package cn.seventeen.context.support;

import cn.seventeen.bean.factory.BeanFactory;
import cn.seventeen.bean.factory.HierarchicalBeanFactory;
import cn.seventeen.bean.factory.ListableBeanFactory;
import cn.seventeen.core.env.Environment;
import cn.seventeen.core.event.ApplicationEventPublish;
import cn.seventeen.core.resource.MessageResource;
import cn.seventeen.core.resource.ResourcePatternResolver;

/**
 * ApplicationContext接口，程序上下文，叫运行环境更加适合
 * 该接口规定了一个运行环境所拥有的行为
 * Application作为一个程序的运行环境，
 * 实际上是聚合了运行框架所有需要的组件
 * 因此该接口会继承BeanFactory接口，Environment接口,ResourcePatternResolver接口,springEventPublish接口,MessageResource接口等
 * 而Application自身的行为则为：
 * 1、获取和设置Environment，
 * 2、获取和设置MessageResource
 * 3、获取bean工厂
 * 4、初始化运行环境
 *
 * 对外则表示为一个ApplicationContext的子类
 */
public interface ApplicationContext extends Environment, MessageResource, ResourcePatternResolver, HierarchicalBeanFactory, ListableBeanFactory, ApplicationEventPublish {

    //获取Environment
    public abstract Environment getEnvironment();

    //设置Environment
    public abstract void setEnvironment(Environment environment);

    //获取MessageResource
    public abstract MessageResource getMessageResource();

    //设置MessageResource
    public abstract void setMessageResource(MessageResource messageResource);

    //获取bean工厂
    public abstract BeanFactory getBeanFactory();

    //初始化运行环境
    public abstract void initial();

}
