package cn.seventeen.framework.asm.struts.util;

import cn.seventeen.framework.asm.struts.util.exception.ByteArrayConvertException;
import cn.seventeen.framework.asm.struts.util.exception.ByteArrayToIntException;
import cn.seventeen.framework.asm.struts.util.exception.ByteArrayToLongException;

public class ByteUtils {

    public static int toInt(byte[] bytes) throws ByteArrayConvertException {
        if(EmptyUtils.isNull(bytes)){
            throw new ByteArrayToIntException();
        }
        if(bytes.length>4){
            throw new ByteArrayToIntException("byte数组长度过长，int值将溢出");
        }
        int value = bytes[0];
        for(int i=1;i<bytes.length;i++) {
            value = (value << 8) + bytes[i];
        }
        return value;
    }

    public static long toLong(byte[] bytes) throws ByteArrayConvertException {
        if(EmptyUtils.isNull(bytes)){
            throw new ByteArrayToLongException();
        }
        if(bytes.length>8){
            throw new ByteArrayToLongException("byte数组长度过长，long值将溢出");
        }
        long value = bytes[0];
        for(int i=1;i<bytes.length;i++) {
            value = (value << 8) + bytes[i];
        }
        return value;
    }

}
