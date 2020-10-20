package cn.seventeen.framework.asm.array;

import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

/**
 * 为了更高效的使用byte数组
 * 我对byte数组的数据结构进行客制化
 * 让他更加迎合本程序
 * 主要是为了让他在存储类数据，和读取类数据上做了优化
 */
public class CodeByte {

    public static class CodeByteNode{
        private static final int NODE_DATA_SIZE= 1024;
        private byte[] data = new byte[CodeByteNode.NODE_DATA_SIZE];
        private CodeByteNode next;
        private int size;

        public byte[] getData() {
            return data;
        }

        public void setData(byte[] data) {
            this.data = data;
        }

        public CodeByteNode getNext() {
            return next;
        }

        public void setNext(CodeByteNode next) {
            this.next = next;
        }
    }




    public CodeByte(){
        this.head = new CodeByteNode();
        this.current = this.head;
    }

    public CodeByte(InputStream in){
        this.head = new CodeByteNode();
        try{
            this.asByte(in);
        }catch (IOException e){
            System.out.println("CodeByte初始化失败，请确认您传入的字节流是否正确......");
        }
    }

    private CodeByteNode head;

    private CodeByteNode current;

    private int size;

    private int index = 0;

    public void asByte(InputStream in)throws IOException {
        // 检查inputStream的安全性
        if(in ==null){
            throw new IOException("被装换成byte数组的字节流不能为空......");
        }
        // 读取开始前将current指针指向头结点
        CodeByteNode current = this.head;
        // 读取开始前将数组指针指向头结点的数组
        byte[] bytes = current.getData();
        // 将下标初始化为0
        int index = 0;
        // 创建一个临时接收数据的对象
        int code;
        // 由于会重新读取数据，必然会导致原本数据长度的改变，于是我们需要重新计算数据长度
        this.size = 0;
        // 循环，读取数据
        while (-1!=(code = in.read())){
            // 当一个节点数据存满以后，生成下一个节点，并把current指向下一个节点
            if(index == CodeByteNode.NODE_DATA_SIZE) {
                current.size = index;
                this.size+=current.size;
                index = 0;
                current.next = new CodeByteNode();
                current = current.next;
                bytes = current.getData();
            }
            bytes[index++] = (byte) code;
        }
        current.size = index;
        this.size+=current.size;
        // 数据载入完毕后，将current指针指向head指针。这时用户已经可以使用内部数据了
        this.current = this.head;
    }

    public byte[] getData(int size) throws Exception{
        // 数据校验，获取数据的长度必须大于0
        if(size<=0){
            throw new Exception("读取数据长度非法，读取数据的长度必须大于0......");
        }else if(size+this.index>this.size){
            throw new Exception("读取数据长度非法，读取内容将超出数据域......");
        }
        // 初始化数据读取对象，和数据接收对象
        byte[] bytes = new byte[size];
        byte[] data = this.current.getData();
        int index = this.index%CodeByteNode.NODE_DATA_SIZE;
        // 开始循环读取数据
        for(int i =0;i<size;i++){
            // 如果当前节点的数据读取完了，就进入下一个节点
            if(index==CodeByteNode.NODE_DATA_SIZE){
                index = 0;
                this.current = this.current.getNext();
                data = this.current.getData();
            }
            bytes[i] = data[index++];
        }
        // 在数据读取结束前，校正指针位置
        this.index += size;
        return bytes;
    }

    public void reset(){
        this.index = 0;
        this.current = this.head;
    }

    @Override
    public String toString() {
        CodeByteNode current = this.head;
        byte[] bytes = new byte[this.size];
        byte[] data = current.getData();
        int index = 0;
        // 开始循环读取数据
        for(int i =0;i<this.size;i++){
            // 如果当前节点的数据读取完了，就进入下一个节点
            if(index==CodeByteNode.NODE_DATA_SIZE){
                index = 0;
                current = current.getNext();
                data = current.getData();
            }
            bytes[i] = data[index++];
        }
        String string = null;
        try {
            string = new String(bytes, "GBK");
        }catch (IOException e){
            System.out.println("字符串转化失败");
        }
        return string;
    }
    public void showList(){
        CodeByteNode current = this.head;
        byte[] data = current.getData();
        int index = 0;
        // 开始循环读取数据
        for(int i =0;i<this.size;i++){
            // 如果当前节点的数据读取完了，就进入下一个节点
            if(index==CodeByteNode.NODE_DATA_SIZE){
                index = 0;
                current = current.getNext();
                data = current.getData();
            }
            System.out.print(data[index++]+"  ");
            if((index+1)%20==0){
                System.out.println();
            }
        }
    }
}
