package cn.seventeen.framework.asm.struts.constant;

public class MethodTypeInfoConstant implements ConstantStruts {
    // 常量类型
    private byte constantType = CONSTANT_METHOD_TYPE_INDEX;

    // 指向方法描述符的UTF8常量引用
    private byte[] infoIndex;

    public MethodTypeInfoConstant() {
    }

    public MethodTypeInfoConstant(byte[] bytes) {
        this.infoIndex = bytes;
    }

}
