package cn.seventeen.framework.asm.struts.constant;

public class DoubleInfoConstant implements ConstantStruts {

    // 常量类型
    private byte constantType = CONSTANT_DOUBLE_INDEX;

    // 常量值byte数组
    private byte[] value;

    public DoubleInfoConstant() {
    }

    public DoubleInfoConstant(byte[] bytes) {
        this.value = bytes;
    }

}
