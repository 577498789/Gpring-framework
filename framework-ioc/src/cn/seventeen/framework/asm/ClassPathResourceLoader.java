package cn.seventeen.framework.asm;

import cn.seventeen.framework.asm.array.VariableArray;
import cn.seventeen.framework.asm.array.VariableCharArray;

import java.io.InputStream;

public class ClassPathResourceLoader {

    // 通过类名获取类的元数据
    public byte[] getMateDataForClass(String className) throws Exception {
        VariableCharArray variableArray = new VariableCharArray();

        if(className == null|| className.length() ==0){
            throw new Exception("待转化为汇编码的类名为空......");
        }

        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(className.replace('.', '/'));
        int dataSize = 0;
        while (-1!=resourceAsStream.read()){
            dataSize++;
        }
        byte [] bytes = new byte[dataSize];
        int code = -1;
        int index = 0;
        resourceAsStream.reset();
        while (-1!=(code = resourceAsStream.read())){
            bytes[index++] = (byte) code;
        }
        return bytes;
    }

    public byte[] getMateDataForClass(Class clazz) throws Exception {
        return getMateDataForClass(clazz.toString());
    }

}
