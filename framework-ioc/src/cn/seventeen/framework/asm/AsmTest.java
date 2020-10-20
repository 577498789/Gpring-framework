package cn.seventeen.framework.asm;

public class AsmTest {
    public static void main(String[]args) throws Exception{
//        new AsmCodeLoader().asStrutsTree(new ClassPathResourceLoader().getMateDataForClass(AsmTest.class));
        System.out.println(new ClassConstantLoader().getMateDataForClass(AsmTest.class));
        new AsmCodeLoader().asStrutsTree(new ClassConstantLoader().getMateDataForClass(AsmTest.class));
    }
}
