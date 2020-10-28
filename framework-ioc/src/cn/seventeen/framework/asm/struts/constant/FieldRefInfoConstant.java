package cn.seventeen.framework.asm.struts.constant;

/**
 * 该类是类文件结构中，常量表的其中之一，
 * 字段引用的常量，
 * 其实际值是对于常量表的引用，他引用了常量表中的具体的常量，
 * 那个常量的值，就是该字段的实际引用类
 */
public class FieldRefInfoConstant implements ConstantStruts {

    // 常量类型
    private byte constantType = CONSTANT_FIELD_REF_INDEX;

    // 指向字段描述符的引用（Constant_NameAndType_Info）
    private byte[] fieldRef;

    public FieldRefInfoConstant() {
    }

    public FieldRefInfoConstant(byte[] bytes) {
        this.fieldRef = bytes;
    }

}
