package cn.seventeen.framework.asm;

import cn.seventeen.framework.asm.array.VariableArray;
import cn.seventeen.framework.asm.array.VariableCharArray;

import java.io.InputStream;

public class ClassPathResourceLoader {

    // 通过类名获取类的元数据
    public char[] getMateDataForClass(String className) throws Exception {
        VariableCharArray variableArray = new VariableCharArray();

        if(className == null|| className.length() ==0){
            throw new Exception("待转化为汇编码的类名为空......");
        }
        char [] chars = new char[1024];
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(className.replace('.', '/'));
        int code = -1;
        while (-1!=(code = resourceAsStream.read())){
            chars[code] = (char) code;
        }
        return chars;
    }

    public char[] getMateDataForClass(Class clazz) throws Exception {
        return getMateDataForClass(clazz.toString());
    }

}
