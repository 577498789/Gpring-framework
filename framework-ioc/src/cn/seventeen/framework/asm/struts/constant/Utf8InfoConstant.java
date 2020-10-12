package cn.seventeen.framework.asm.struts.constant;

/**
 * 该类是常量池中常量的一种类型
 * 其内部值为UTF-8的字符串
 */

public class Utf8InfoConstant implements  ConstantStruts{

    // 常量类型
    private byte constantType = CONSTANT_UTF8_INDEX;

    // 字符串长度
    private int length;

    //字符数组
    private char[] value;


}
