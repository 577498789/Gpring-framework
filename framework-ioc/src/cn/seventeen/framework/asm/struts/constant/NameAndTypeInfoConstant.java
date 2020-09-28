package cn.seventeen.framework.asm.struts.constant;

public class NameAndTypeInfoConstant implements ConstantStruts{
    // 常量类型
    private byte constantType = CONSTANT_NAME_AND_TYPE_REF_INDEX;

    // 指向类名称的字符串常量引用
    private int classNameIndex;

    // 指向类描述符的常量的索引
    private int infoIndex;
}
