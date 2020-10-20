package cn.seventeen.framework.asm;

import cn.seventeen.framework.asm.array.CodeByte;

import java.io.InputStream;

public class ClassConstantLoader {

    // 通过类名获取类的元数据
    public CodeByte getMateDataForClass(String className) throws Exception {
        System.out.println("将要装换的类为："+className);
        if(className == null|| className.length() ==0){
            throw new Exception("待转化为汇编码的类名为空......");
        }
        InputStream resourceAsStream = null;
        try{
            // 使用类加载器的资源加载器，将类路径下的文件加载成文件流
            resourceAsStream = this.getClass().getResourceAsStream("/"+className.replace('.', '/')+".class");
        }catch (Exception e){
            throw new Exception("类文件加载失败......");
        }
        return new CodeByte(resourceAsStream);
    }

    // 通过类的class对象获得其元数据
    public CodeByte getMateDataForClass(Class clazz) throws Exception {
        return getMateDataForClass(clazz.toString().substring(6));
    }
}
