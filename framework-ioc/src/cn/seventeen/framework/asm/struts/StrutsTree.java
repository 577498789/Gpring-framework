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

}
