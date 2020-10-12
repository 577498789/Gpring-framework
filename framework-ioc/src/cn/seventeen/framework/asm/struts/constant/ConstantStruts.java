package cn.seventeen.framework.asm.struts.constant;

public interface ConstantStruts {

    // 常量类型编号----UTF-8编码字符串
    public final static int CONSTANT_UTF8_INDEX= 1;

    // 常量类型编号----整型字面量
    public final static int CONSTANT_INTEGER_INDEX= 3;

    // 常量类型编号----浮点型字面量
    public final static int CONSTANT_FLOAT_INDEX= 4;

    // 常量类型编号----长整型字面量
    public final static int CONSTANT_LONG_INDEX= 5;

    // 常量类型编号----双精度浮点型字面量
    public final static int CONSTANT_DOUBLE_INDEX= 6;

    // 常量类型编号----类或接口的符号应用
    public final static int CONSTANT_CLASS_REF_INDEX= 7;

    // 常量类型编号----字符串类型字面量
    public final static int CONSTANT_STRING_INDEX= 8;

    // 常量类型编号----字段的符号引用
    public final static int CONSTANT_FIELD_REF_INDEX= 9;

    // 常量类型编号----类中方法的符号引用
    public final static int CONSTANT_METHOD_REF_INDEX= 10;

    // 常量类型编号----接口方法的符号引用
    public final static int CONSTANT_INTERFACE_METHOD_REF_INDEX= 11;

    // 常量类型编号----字段或者方法的部分符号引用
    public final static int CONSTANT_NAME_AND_TYPE_REF_INDEX= 12;

    // 常量类型编号----方法句柄
    public final static int CONSTANT_METHOD_HANDLE_INDEX= 15;

    // 常量类型编号----标识方法类型
    public final static int CONSTANT_METHOD_TYPE_INDEX= 16;

    // 常量类型编号----表示一个动态方法的调用点
    public final static int CONSTANT_INVOKE_DYNAMIC_INDEX= 18;


    /**
     * 该数组存储的是对应序号的常量类型所占的长度
     * 如字Constant_Utf8_info其能存储的最大char数量为2byte长度
     */
    public static final int[] CONSTANT_STRUTS_LENGTH_TABLE=
            {2,0,4,4,8,8,2,2,2,2,2,2,0,0,1,2,0,2};



    // TODO 使用适配器模式来解决获得value的问题，对应的constant使用对应的适配器解析其内部值的引用、传递问题


}
