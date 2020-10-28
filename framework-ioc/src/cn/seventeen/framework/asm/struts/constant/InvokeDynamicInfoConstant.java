package cn.seventeen.framework.asm.struts.constant;

import java.util.Arrays;

public class InvokeDynamicInfoConstant implements ConstantStruts {
    // 常量类型
    private byte constantType = CONSTANT_INVOKE_DYNAMIC_INDEX;

    // 必须是对class中引导方法表的bootstrap_method[]的引用
    private byte[] bootstrapMethodIndex;

    // 指向Constant_NameAndType_Info要调用的方法,表示方法名和方法类型
    private byte[] infoIndex;

    public InvokeDynamicInfoConstant() {
    }

    public InvokeDynamicInfoConstant(byte[] bytes) {
        this.bootstrapMethodIndex = Arrays.copyOfRange(bytes, 0, 1);
        this.infoIndex = Arrays.copyOfRange(bytes, 2, 3);
    }

}
