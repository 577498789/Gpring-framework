package cn.seventeen.framework.asm;

import cn.seventeen.framework.asm.array.CodeByte;
import cn.seventeen.framework.asm.struts.StrutsTree;
import cn.seventeen.framework.asm.struts.constant.ConstantStruts;
import cn.seventeen.framework.asm.struts.util.ByteUtils;
import com.sun.org.apache.bcel.internal.classfile.Code;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

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
        byte[] magic = classCode.getData(4);
        strutsTree.setMagic(magic);
        System.out.println("这是魔数：" + magic[0] + " " + magic[1] + " " + magic[2] + " " + magic[3]);


        byte[] major = classCode.getData(2);
        strutsTree.setMajor_version(major);
        int majorVersion = (((int) major[0]) << 8) + major[1];
        byte[] minor = classCode.getData(2);
        strutsTree.setMinor_version(minor);
        int minorVersion = (((int) minor[0]) << 8) + minor[1];
        System.out.println("次版本号" + majorVersion);
        System.out.println("主版本号：" + minorVersion);

        byte[] constant_pool_count = classCode.getData(2);
        int constantPoolCount = ByteUtils.toInt(constant_pool_count);
        strutsTree.setConstant_pool_count(constant_pool_count);
        ConstantStruts[] constantStrutsList = new ConstantStruts[constantPoolCount - 1];
        for (int i = 1; i < constantPoolCount; i++) {
            // 获得常量类型
            int constant_type = classCode.getData(1)[0];
            // 如果是UTF8字符串类型，就进行解析
            if(constant_type==ConstantStruts.CONSTANT_UTF8_INDEX){
                // TODO 解析UTF8字符串
                int stringLength = ByteUtils.toInt(classCode.getData(2));

                for(int j=0;j<stringLength;j++){
                    
                }
            }else{
                // 不是UTF8类型，直接使用构造器进行数据初始化
                Class clazz = ConstantStruts.CONSTANT_CLASSES[constant_type - 1];
                Constructor constantStrutsConstructor = clazz.getConstructor(byte[].class);
                constantStrutsList[i] = (ConstantStruts) constantStrutsConstructor.newInstance(classCode.getData(ConstantStruts.CONSTANT_STRUTS_LENGTH_TABLE[constant_type-1]));
            }

        }
        return strutsTree;
    }
}
