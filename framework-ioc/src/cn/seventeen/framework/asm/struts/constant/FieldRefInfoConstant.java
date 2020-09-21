package cn.seventeen.framework.asm.struts.constant;

public class FieldRefInfoConstant implements ConstantStruts{

    private byte[] fieldRef;

    @Override
    public byte[] getValue() {
        return fieldRef;
    }

    @Override
    public void setValue(byte[] value) {
        this.fieldRef = value;
    }
}
