package cn.seventeen.framework.asm.struts;

public interface ClassStrutsConstant {

    /**
     * 以下是类访问标志的常量
     */

    // 公开的
    public static final int ACC_PUBLIC = 0x0001;

    // final，只有类可设置，接口不行
    public static final int ACC_FINAL = 0x0010;

    // 是否允许使用invokespecial字节码指令的新语义，这条指令在jdk1.0.2时发生过改变，为了区分使用新语义还是老语义加入了这个标志，1.0.2后的都必须为真
    public static final int ACC_SUPER = 0x0020;

    // 标识这是一个接口
    public static final int ACC_INTERFACE = 0x0200;

    // 是否为抽象类型，对于接口或抽象类来说此值为真，其他为假
    public static final int ACC_ABSTRACT = 0x0400;

    // 标识这个类并非由用户代码生成
    public static final int ACC_SYNTHETIC = 0x1000;

    // 标识这是一个注解
    public static final  int ACC_ANNOTATION = 0x2000;

    // 标识这是一个menu
    public static final  int ACC_MENU = 0x4000;

    // 标识这是一个模块
    public static final  int ACC_MODULE = 0x8000;

}
