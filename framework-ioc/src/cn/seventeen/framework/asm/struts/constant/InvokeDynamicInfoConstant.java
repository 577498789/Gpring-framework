package cn.seventeen.framework.asm.struts.constant;

public class InvokeDynamicInfoConstant implements ConstantStruts{
    // 常量类型
    private byte constantType = CONSTANT_INVOKE_DYNAMIC_INDEX;

    // 必须是对class中引导方法表的bootstrap_method[]的引用
    private int bootstrapMethodIndex;

    // 指向Constant_NameAndType_Info要调用的方法,表示方法名和方法类型
    private int infoIndex;

}
