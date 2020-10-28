package cn.seventeen.framework.asm.struts.constant;

public class IntegerInfoConstant implements ConstantStruts {

    // 常量类型
    private byte constantType = CONSTANT_INTEGER_INDEX;

    // 常量值byte数组
    private byte[] value;

    public IntegerInfoConstant() {
    }

    public IntegerInfoConstant(byte[] bytes) {
        this.value = bytes;
    }

}
