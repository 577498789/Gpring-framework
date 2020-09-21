package cn.seventeen.framework.asm.struts.constant;

public interface ConstantStruts {

    public static final int[] CONSTANT_STRUTS_LENGTH_TABLE=
            {2,0,4,4,8,8,2,2,2,2,2,2,0,0,1,2,0,2};

    byte[] getValue();

    void setValue(byte[] value);

}
