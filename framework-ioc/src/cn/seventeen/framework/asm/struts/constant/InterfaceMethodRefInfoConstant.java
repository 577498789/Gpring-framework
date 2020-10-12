package cn.seventeen.framework.asm.struts.constant;

public class InterfaceMethodRefInfoConstant implements ConstantStruts{
    // 常量类型
    private byte constantType = CONSTANT_INTERFACE_METHOD_REF_INDEX;

    // 指向声明方法的接口 的描述符（标识这个方法属于哪个接口）
    private int fromClassIndex;

    // 指向名称及类描述符（Constant_NameAndType_Info）
    private int infoIndex;
}