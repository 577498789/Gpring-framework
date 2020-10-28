package cn.seventeen.framework.asm.struts;

/**
 * 字段表，
 * 用于存储类中的所有成员变量
 */
public class FieldStruts {

    // 字段修饰符
    public byte[] ACCESS_FLAGS;

    // 对该字段“简单名称”的常量引用
    public byte[] nameIndex;

    // 字段描述符的引用，I
    public byte[] infoIndex;

    public FieldStruts(){}

}
