package cn.seventeen.framework.asm.struts.constant;

public interface ConstantStruts {

    public static final int[] CONSTANT_STRUTS_LENGTH_TABLE=
            {2,0,4,4,8,8,2,2,2,2,2,2,0,0,1,2,0,2};

    // 使用适配器模式来解决获得value的问题，对应的constant使用对应的适配器解析其内部值的引用、传递问题
    byte[] getValue();

    void setValue(byte[] value);

}
