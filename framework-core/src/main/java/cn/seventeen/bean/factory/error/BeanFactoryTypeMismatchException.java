package cn.seventeen.bean.factory.error;

public class BeanFactoryTypeMismatchException extends RuntimeException{
    public BeanFactoryTypeMismatchException(){
        super("The beanFactory you provided does't match the required beanFactory type");
    }
}
