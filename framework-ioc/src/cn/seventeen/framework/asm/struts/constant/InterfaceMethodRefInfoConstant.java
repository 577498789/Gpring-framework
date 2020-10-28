package cn.seventeen.framework.asm.struts.constant;

import java.util.Arrays;

public class InterfaceMethodRefInfoConstant implements ConstantStruts {
    // 常量类型
    private byte constantType = CONSTANT_INTERFACE_METHOD_REF_INDEX;

    // 指向声明方法的接口 的描述符（标识这个方法属于哪个接口）
    private byte[] fromClassIndex;

    // 指向名称及类描述符（Constant_NameAndType_Info）
    private byte[] infoIndex;

    public InterfaceMethodRefInfoConstant() {
    }

    public InterfaceMethodRefInfoConstant(byte[] bytes) {
        this.infoIndex = Arrays.copyOfRange(bytes, 0, 1);
        this.fromClassIndex = Arrays.copyOfRange(bytes, 2, 3);
    }

}
