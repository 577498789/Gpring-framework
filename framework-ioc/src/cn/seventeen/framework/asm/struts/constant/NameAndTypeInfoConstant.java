package cn.seventeen.framework.asm.struts.constant;

import java.util.Arrays;

public class NameAndTypeInfoConstant implements ConstantStruts {
    // 常量类型
    private byte constantType = CONSTANT_NAME_AND_TYPE_REF_INDEX;

    // 指向类名称的字符串常量引用
    private byte[] classNameIndex;

    // 指向类描述符的常量的索引
    private byte[] infoIndex;

    public NameAndTypeInfoConstant() {
    }

    public NameAndTypeInfoConstant(byte[] bytes) {
        this.classNameIndex = Arrays.copyOfRange(bytes, 0, 1);
        this.infoIndex = Arrays.copyOfRange(bytes, 2, 3);
    }

}
