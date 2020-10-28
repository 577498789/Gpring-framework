package cn.seventeen.framework.asm.struts.constant;

public class LongInfoConstant implements ConstantStruts {

    // 常量类型
    private byte constantType = CONSTANT_LONG_INDEX;

    // long类型值的字面量
    private byte[] value;

    public LongInfoConstant() {
    }

    public LongInfoConstant(byte[] bytes) {
        this.value = bytes;
    }


}
