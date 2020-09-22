package cn.seventeen.framework.asm.struts.constant;

/**
 * 该类是类文件结构中，常量表的其中之一，
 * 字段引用的常量，
 * 其实际值是对于常量表的引用，他引用了常量表中的具体的常量，
 * 那个常量的值，就是该字段的实际引用类
 */
public class FieldRefInfoConstant implements ConstantStruts{

    private byte[] fieldRef;

    public byte[] getValue() {
        return fieldRef;
    }

    public void setValue(byte[] value) {
        this.fieldRef = value;
    }


    // 啊啊啊啊aaaaaaaaaaaaaaaaa
}
