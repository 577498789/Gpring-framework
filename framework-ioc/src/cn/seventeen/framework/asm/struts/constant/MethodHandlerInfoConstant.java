package cn.seventeen.framework.asm.struts.constant;

public class MethodHandlerInfoConstant implements ConstantStruts{

    // 常量类型
    private byte constantType = CONSTANT_METHOD_HANDLE_INDEX;

    // 值必须是1~9，它决定了方法句柄的类型，方法句柄的类型表示了方法句柄的字节码行为
    private int refreshKind;

    // 值必须是对常量池的有效索引
    private int refreshIndex;

}
