package cn.seventeen.framework.asm.struts.constant;

public class ClassInfoConstant implements ConstantStruts{
    // 常量类型
    private byte constantType = CONSTANT_CLASS_REF_INDEX;

    // 指向全类限定名的字符串常量索引
    private int valueIndex;
}
