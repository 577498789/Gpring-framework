package cn.seventeen.framework.asm.struts.util.exception;

public class ByteArrayToLongException extends ByteArrayConvertException{

    public ByteArrayToLongException() {
        super("byte数组转化为long类型时出错");
    }

    public ByteArrayToLongException(String message){
        super("byte数组转化为long类型时出错,"+message);
    }

}
