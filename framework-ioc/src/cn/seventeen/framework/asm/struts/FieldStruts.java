package cn.seventeen.framework.asm.struts;

/**
 * 字段表，
 * 用于存储类中的所有成员变量,以及类变量
 */
public class FieldStruts {

    // 字段修饰符
    public byte[] ACCESS_FLAGS;

    // 对该字段“简单名称”的常量引用
    public byte[] nameIndex;

    // 字段描述符的引用，I
    public byte[] infoIndex;

    public FieldStruts(){}


    public byte[] getACCESS_FLAGS() {
        return ACCESS_FLAGS;
    }

    public void setACCESS_FLAGS(byte[] ACCESS_FLAGS) {
        this.ACCESS_FLAGS = ACCESS_FLAGS;
    }

    public byte[] getNameIndex() {
        return nameIndex;
    }

    public void setNameIndex(byte[] nameIndex) {
        this.nameIndex = nameIndex;
    }

    public byte[] getInfoIndex() {
        return infoIndex;
    }

    public void setInfoIndex(byte[] infoIndex) {
        this.infoIndex = infoIndex;
    }
}
