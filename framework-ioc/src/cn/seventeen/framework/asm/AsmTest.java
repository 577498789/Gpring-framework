package cn.seventeen.framework.asm;

public class AsmTest {
    public static void main(String[]args) throws Exception{
        long  aaa = 1;
        long bbb = 15;
        System.out.println(((aaa&bbb)));

//        new AsmCodeLoader().asStrutsTree(new ClassPathResourceLoader().getMateDataForClass(AsmTest.class));
        System.out.println(new ClassConstantLoader().getMateDataForClass(AsmTest.class));
        new AsmCodeLoader().asStrutsTree(new ClassConstantLoader().getMateDataForClass(AsmTest.class));
    }
}
