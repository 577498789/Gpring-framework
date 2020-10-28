package cn.seventeen.framework.asm.struts;


import cn.seventeen.framework.asm.struts.constant.ConstantStruts;

/**
 * 该类用于描述class文件的结构
 */
public class StrutsTree {
    // 魔数
    private byte[] magic;
    // 次版本号
    private byte[] major_version;
    // 主版本号
    private byte[] minor_version;
    // 常量池计数器
    private byte[] constant_pool_count;
    // 常量池
    private ConstantStruts[] constant_pool;
    // 访问标志
    private byte[] access_flags;
    // 类索引，该类的全类限定名 所对应常量池的下标
    private byte[] this_class;
    // 父类索引，父类的全类限定名 所对应常量池的下标
    private byte[] super_class;
    // 接口计数器
    private byte[] interfaces_count;
    // 接口索引的集合
    private byte[] interfaces;
    // 字段计数器
    private byte[] fields_count;
    // 字段表集合
    private FieldStruts[] fields;
    // 方法计数器
    private byte[] methods_count;
    // 方法表集合
    private MethodStruts[] methods;
    // 属性计数器
    private byte[] attributes_count;
    // 属性表集合
    private AttributeStruts[] attributes;



    public byte[] getMagic() {
        return magic;
    }

    public void setMagic(byte[] magic) {
        this.magic = magic;
    }

    public byte[] getMinor_version() {
        return minor_version;
    }

    public void setMinor_version(byte[] minor_version) {
        this.minor_version = minor_version;
    }

    public byte[] getMajor_version() {
        return major_version;
    }

    public void setMajor_version(byte[] major_version) {
        this.major_version = major_version;
    }

    public byte[] getConstant_pool_count() {
        return constant_pool_count;
    }

    public void setConstant_pool_count(byte[] constant_pool_count) {
        this.constant_pool_count = constant_pool_count;
    }

    public ConstantStruts[] getConstant_pool() {
        return constant_pool;
    }

    public void setConstant_pool(ConstantStruts[] constant_pool) {
        this.constant_pool = constant_pool;
    }

    public byte[] getAccess_flags() {
        return access_flags;
    }

    public void setAccess_flags(byte[] access_flags) {
        this.access_flags = access_flags;
    }

    public byte[] getThis_class() {
        return this_class;
    }

    public void setThis_class(byte[] this_class) {
        this.this_class = this_class;
    }

    public byte[] getSuper_class() {
        return super_class;
    }

    public void setSuper_class(byte[] super_class) {
        this.super_class = super_class;
    }

    public byte[] getInterfaces_count() {
        return interfaces_count;
    }

    public void setInterfaces_count(byte[] interfaces_count) {
        this.interfaces_count = interfaces_count;
    }

    public byte[] getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(byte[] interfaces) {
        this.interfaces = interfaces;
    }

    public byte[] getFields_count() {
        return fields_count;
    }

    public void setFields_count(byte[] fields_count) {
        this.fields_count = fields_count;
    }

    public FieldStruts[] getFields() {
        return fields;
    }

    public void setFields(FieldStruts[] fields) {
        this.fields = fields;
    }

    public byte[] getMethods_count() {
        return methods_count;
    }

    public void setMethods_count(byte[] methods_count) {
        this.methods_count = methods_count;
    }

    public MethodStruts[] getMethods() {
        return methods;
    }

    public void setMethods(MethodStruts[] methods) {
        this.methods = methods;
    }

    public byte[] getAttributes_count() {
        return attributes_count;
    }

    public void setAttributes_count(byte[] attributes_count) {
        this.attributes_count = attributes_count;
    }

    public AttributeStruts[] getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributeStruts[] attributes) {
        this.attributes = attributes;
    }
}
