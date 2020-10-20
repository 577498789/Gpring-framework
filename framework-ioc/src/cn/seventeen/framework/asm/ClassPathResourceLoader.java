package cn.seventeen.framework.asm;

import cn.seventeen.framework.asm.array.VariableArray;
import cn.seventeen.framework.asm.array.VariableCharArray;

import java.io.IOException;
import java.io.InputStream;

public class ClassPathResourceLoader {

    // 通过类名获取类的元数据
    public byte[] getMateDataForClass(String className) throws Exception {
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
        resourceAsStream.mark(450);
        // 先循环一遍获得文件长度
        int dataSize = 0;
        while (-1!=resourceAsStream.read()){
            System.out.println("a");
            dataSize++;
        }

        // 然后创建相等长度的byte数组将其包装好并返回
        byte [] bytes = new byte[dataSize];
        int code = -1;
        int index = 0;
        resourceAsStream.reset();
        while (-1!=(code = resourceAsStream.read())){
            bytes[index++] = (byte) code;
        }
        return bytes;
    }

    //
    public byte[] getMateDataForClass(Class clazz) throws Exception {
        return getMateDataForClass(clazz.toString().substring(6));
    }

}
