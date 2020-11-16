package cn.seventeen.framework.asm;

import cn.seventeen.framework.asm.array.CodeByte;
import cn.seventeen.framework.asm.struts.FieldStruts;
import cn.seventeen.framework.asm.struts.StrutsTree;
import cn.seventeen.framework.asm.struts.constant.ConstantStruts;
import cn.seventeen.framework.asm.struts.constant.Utf8InfoConstant;
import cn.seventeen.framework.asm.struts.util.ByteUtils;
import com.sun.org.apache.bcel.internal.classfile.Code;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.Lock;

public class AsmCodeLoader {

    public StrutsTree asStrutsTree(byte[] classCode) {
        StrutsTree strutsTree = new StrutsTree();
        int index = 0;
        byte[] magic = new byte[4];
        for (int i = 0; i < 4; i++, index++) {
            magic[i] = classCode[index];
        }
        System.out.println("这是魔数：" + magic[0] + " " + magic[1] + " " + magic[2] + " " + magic[3]);
        return strutsTree;
    }

    /**
     * 将字节数组装换为结构树
     *
     * @param classCode
     * @return
     * @throws Exception
     */
    public StrutsTree asStrutsTree(CodeByte classCode) throws Exception {
        StrutsTree strutsTree = new StrutsTree();
        int index = 0;
        // 获得魔数
        byte[] magic = classCode.getData(4);
        strutsTree.setMagic(magic);
        System.out.println("这是魔数：" + magic[0] + " " + magic[1] + " " + magic[2] + " " + magic[3]);

        // 获得最小版本号
        byte[] major = classCode.getData(2);
        strutsTree.setMajor_version(major);
        int majorVersion = (((int) major[0]) << 8) + major[1];
        // 获得最大版本号
        byte[] minor = classCode.getData(2);
        strutsTree.setMinor_version(minor);
        int minorVersion = (((int) minor[0]) << 8) + minor[1];
        System.out.println("次版本号" + majorVersion);
        System.out.println("主版本号：" + minorVersion);

        // 获得常量池
        byte[] constant_pool_count = classCode.getData(2);
//        System.out.println(new String());
        int constantPoolCount = ByteUtils.toInt(constant_pool_count);
        strutsTree.setConstant_pool_count(constant_pool_count);
        ConstantStruts[] constantStrutsList = new ConstantStruts[constantPoolCount - 1];
        System.out.println("常量池总长度:"+constantPoolCount);
        for (int i = 1; i < constantPoolCount-1; i++) {
            // 获得常量类型
            int constant_type = classCode.getData(1)[0];
            // 如果是UTF8字符串类型，就进行解析
            if(constant_type==ConstantStruts.CONSTANT_UTF8_INDEX){
                Utf8InfoConstant utf8InfoConstant = new Utf8InfoConstant(classCode.getData(ByteUtils.toInt(classCode.getData(2))));
                constantStrutsList[i] = utf8InfoConstant;
//                System.out.println(utf8InfoConstant.toString());
            }else{
                // 不是UTF8类型，直接使用构造器进行数据初始化
//                System.out.println("第"+i+"个常量类型编号为："+constant_type);
//                System.out.println("当前地址偏移为："+classCode.getIndex());
                Class clazz = ConstantStruts.CONSTANT_CLASSES[constant_type - 1];
                Constructor constantStrutsConstructor = clazz.getConstructor(byte[].class);
                constantStrutsList[i] = (ConstantStruts) constantStrutsConstructor.newInstance(classCode.getData(ConstantStruts.CONSTANT_STRUTS_LENGTH_TABLE[constant_type-1]));
            }
        }

        // 获得该类的访问标志
        strutsTree.setAccess_flags(classCode.getData(2));

        // 获得类索引
        strutsTree.setThis_class(classCode.getData(2));

        // 获得父类索引
        strutsTree.setSuper_class(classCode.getData(2));

        // 获得接口索引集合长度
        strutsTree.setInterfaces_count(classCode.getData(1));
        int interfaceCount = ByteUtils.toInt(strutsTree.getInterfaces_count());
        System.out.println("接口集合长度为："+interfaceCount);

        System.out.println("classCode总长度为："+classCode.getSize());
        System.out.println("当前地址偏移为："+classCode.getIndex());
        if(interfaceCount>0){
            // 获得接口索引集合
            strutsTree.setInterfaces(classCode.getData(2*interfaceCount));
        }
        // 字段表集合长度
        strutsTree.setFields_count(classCode.getData(2));
        int fields_count = ByteUtils.toInt(strutsTree.getFields_count());

        if(fields_count>0){
            // 字段表集合
            FieldStruts[] fieldStruts = new FieldStruts[fields_count];
            for(int i = 0;i<fields_count;i++){
                fieldStruts[i] = new FieldStruts();
                fieldStruts[i].setACCESS_FLAGS(classCode.getData(2));
                fieldStruts[i].setNameIndex(classCode.getData(2));
                fieldStruts[i].setInfoIndex(classCode.getData(2));
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println("下一个是0嗷");
                System.out.println(ByteUtils.toInt(classCode.getData(1)));
            }
            strutsTree.setFields(fieldStruts);
        }


        return strutsTree;
    }
}
