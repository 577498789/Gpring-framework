package cn.seventeen.framework.asm;

import cn.seventeen.framework.asm.struts.StrutsTree;
import cn.seventeen.framework.asm.struts.constant.InterfaceMethodRefInfoConstant;

public class AsmTest {
    public static void main(String[]args) throws Exception{
//        new AsmCodeLoader().asStrutsTree(new ClassPathResourceLoader().getMateDataForClass(AsmTest.class));
//        System.out.println(new ClassConstantLoader().getMateDataForClass(StrutsTree.class));
        new AsmCodeLoader().asStrutsTree(new ClassConstantLoader().getMateDataForClass(StrutsTree.class));
    }
}
