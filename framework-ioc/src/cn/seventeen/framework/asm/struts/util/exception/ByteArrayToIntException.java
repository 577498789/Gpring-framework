package cn.seventeen.framework.asm.struts.util.exception;

public class ByteArrayToIntException extends ByteArrayConvertException {

    public ByteArrayToIntException() {
        super("byte数组转化为int类型时出错");
    }

    public ByteArrayToIntException(String message){
        super("byte数组转化为int类型时出错,"+message);
    }

}
