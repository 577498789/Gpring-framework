package cn.seventeen.framework.asm.struts.util;

public class EmptyUtils {


    public static boolean isNull(Object value){
        return value==null;
    }

    public static boolean isNotNull(Object value){
        return value!=null;
    }

    public static boolean isNull(Object[] value){
        return value==null||value.length==0;
    }

    public static boolean isNotNull(Object[] value){
        return value!=null&&value.length!=0;
    }

}
