package cn.seventeen.framework.asm.struts.constant;

import sun.nio.cs.ext.GBK;

import java.util.Arrays;

/**
 * 该类是常量池中常量的一种类型
 * 其内部值为UTF-8的字符串
 */

public class Utf8InfoConstant implements ConstantStruts {

    // 常量类型
    private byte constantType = CONSTANT_UTF8_INDEX;

    // 字符串长度
    private byte[] length;

    //字符数组
    private byte[] value;

    public Utf8InfoConstant() {
    }

    public Utf8InfoConstant(byte[] bytes) {
        this.length = Arrays.copyOfRange(bytes, 0, 1);
        this.value = Arrays.copyOfRange(bytes, 2, bytes.length - 1);
    }

}
