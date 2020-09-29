package cn.seventeen.framework.asm.struts;

public interface FieldStrutsConstant {
    /**
     * 以下是字段访问标志的常量
     */

    // 访问权限public
    public static final int ACC_PUBLIC = 0x0001;

    // 访问权限private
    public static final int ACC_PRIVATE = 0x0002;

    // 访问权限protected
    public static final int ACC_PROTECTED = 0x0004;

    // 访问权限静态
    public static final int ACC_STATIC = 0x0008;

    // 访问权限final
    public static final int ACC_FINAL = 0x0010;

    // 是否volatile
    public static final int ACC_VOLATILE = 0x0040;

    // 是否transient
    public static final int ACC_TRANSIENT = 0x0080;

    // 是否由编译器自动产生
    public static final int ACC_SYNTHETIC = 0x1000;

    // 是否是menu
    public static final int ACC_MENU = 0x4000;


}
