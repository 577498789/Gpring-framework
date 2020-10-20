package cn.seventeen.framework.asm;

import cn.seventeen.framework.asm.array.CodeByte;
import cn.seventeen.framework.asm.struts.StrutsTree;
import com.sun.org.apache.bcel.internal.classfile.Code;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class AsmCodeLoader {

    public StrutsTree asStrutsTree(byte[] classCode) {
        StrutsTree strutsTree = new StrutsTree();
        int index = 0;
        byte[] magic = new byte[4];
        for(int i=0;i<4;i++,index++){
            magic[i] = classCode[index];
        }
        System.out.println("这是魔数："+magic[0]+" "+magic[1]+" "+magic[2]+" "+magic[3]);
        return strutsTree;
    }

    public StrutsTree asStrutsTree(CodeByte classCode) throws Exception{

        StrutsTree strutsTree = new StrutsTree();
        int index = 0;
        byte[] magic = classCode.getData(4);

        System.out.println("这是魔数："+magic[0]+" "+magic[1]+" "+magic[2]+" "+magic[3]);

        classCode.getData(2);

        byte[] minor = classCode.getData(2);
        int minorVersion = (((int)minor[0])<<8)+minor[1];
        byte[] major = classCode.getData(2);
        int majorVersion = (((int)major[0])<<8)+major[1];

        System.out.println("主版本号："+minorVersion);
        System.out.println("次版本号"+majorVersion);
        return strutsTree;
    }
}
