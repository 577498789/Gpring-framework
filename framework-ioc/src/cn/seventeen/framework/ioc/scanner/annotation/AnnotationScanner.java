package cn.seventeen.framework.ioc.scanner.annotation;

import java.io.File;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.List;

// 该类用于扫描注解使用，目前只写一个
// TODO 以后会做优化，做成一个簇族用于大量注解扫描，同时会提供用户自定义注解扫描器的接口
public class AnnotationScanner {

    public List<Annotation> getAnnotations(Class clazz){
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(clazz.toString().replace('.', '/')+".class");
        try{
            int data = resourceAsStream.read();
            while(data!=-1){

            }
        }catch (Exception e){

        }finally {

        }
        return null;
    }
}
