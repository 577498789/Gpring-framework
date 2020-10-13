package cn.seventeen.framework.asm.struts;


import cn.seventeen.framework.asm.struts.constant.ConstantStruts;

/**
 * 该类用于描述class文件的结构
 */
public class StrutsTree {
    // 魔数
    private String magic;
    // 主版本号
    private char minor_version;
    // 次版本号
    private char major_version;
    // 常量池计数器
    private char constant_pool_count;
    // 常量池
    private ConstantStruts[] constant_pool;
    // 访问标志
    private char access_flags;
    // 类索引，该类的全类限定名 所对应常量池的下标
    private char this_class;
    // 父类索引，父类的全类限定名 所对应常量池的下标
    private char super_class;
    // 接口计数器
    private char interfaces_count;
    // 接口索引的集合
    private char[] interfaces;
    // 字段计数器
    private char fields_count;
    // 字段表集合
    private FieldStruts[] fields;
    // 方法计数器
    private char methods_count;
    // 方法表集合
    private MethodStruts[] methods;
    // 属性计数器
    private char attributes_count;
    // 属性表集合
    private AttributeStruts[] attributes;

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public void setMinor_version(char minor_version) {
        this.minor_version = minor_version;
    }

    public void setMajor_version(char major_version) {
        this.major_version = major_version;
    }

    public void setConstant_pool_count(char constant_pool_count) {
        this.constant_pool_count = constant_pool_count;
    }

    public void setConstant_pool(ConstantStruts[] constant_pool) {
        this.constant_pool = constant_pool;
    }

    public void setAccess_flags(char access_flags) {
        this.access_flags = access_flags;
    }

    public void setThis_class(char this_class) {
        this.this_class = this_class;
    }

    public void setSuper_class(char super_class) {
        this.super_class = super_class;
    }

    public void setInterfaces_count(char interfaces_count) {
        this.interfaces_count = interfaces_count;
    }

    public void setInterfaces(char[] interfaces) {
        this.interfaces = interfaces;
    }

    public void setFields_count(char fields_count) {
        this.fields_count = fields_count;
    }

    public void setFields(FieldStruts[] fields) {
        this.fields = fields;
    }

    public void setMethods_count(char methods_count) {
        this.methods_count = methods_count;
    }

    public void setMethods(MethodStruts[] methods) {
        this.methods = methods;
    }

    public void setAttributes_count(char attributes_count) {
        this.attributes_count = attributes_count;
    }

    public void setAttributes(AttributeStruts[] attributes) {
        this.attributes = attributes;
    }

    public String getMagic() {
        return magic;
    }

    public char getMinor_version() {
        return minor_version;
    }

    public char getMajor_version() {
        return major_version;
    }

    public char getConstant_pool_count() {
        return constant_pool_count;
    }

    public ConstantStruts[] getConstant_pool() {
        return constant_pool;
    }

    public char getAccess_flags() {
        return access_flags;
    }

    public char getThis_class() {
        return this_class;
    }

    public char getSuper_class() {
        return super_class;
    }

    public char getInterfaces_count() {
        return interfaces_count;
    }

    public char[] getInterfaces() {
        return interfaces;
    }

    public char getFields_count() {
        return fields_count;
    }

    public FieldStruts[] getFields() {
        return fields;
    }

    public char getMethods_count() {
        return methods_count;
    }

    public MethodStruts[] getMethods() {
        return methods;
    }

    public char getAttributes_count() {
        return attributes_count;
    }

    public AttributeStruts[] getAttributes() {
        return attributes;
    }
}
