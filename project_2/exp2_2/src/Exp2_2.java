/*
    数据类型 基础数据类型 数值型 整数类型（byte---1个字节 八位
                                   short--2个字节
                                   int----4个字节
                                   long----8个字节）
                          浮点数类型（float---4个字节
                                   double--8个字节）
                              字符型（char-----2个字节）
                              布尔型（boolean）只有true ，false
     引用数据类型 类（class），接口（interface），数组，枚举（envm），注解（annotation）
   */
public class Exp2_2 {
    public static void main(String[] args){
        int x;                                          //定义或者声明一个变量，必须要先声明变量，不要重复声明
        x = 10;                                         //给变量x赋值
        System.out.println(x);
        x = 11;
        System.out.println(x);
        long y;
        y = 1000000000000000L;                      //长整型
        System.out.println(y);
        //long y;
        //y = 1;
        float f= 123.4F;                                //浮点数float,float类型必须加上字母F，默认为0
        System.out.println(f);
        double d1 =123.4;                               //默认为double,可以省略0
        System.out.println(d1);
        char c ='a';                                     //为一个字符型变量赋值为字符a，只能一个字符且是单引号''
        System.out.println(c);
        char ch = 98;                                   //表示ASCII，表示在计算机上面的存储
        System.out.println(ch);
        boolean flag = false;                           //布尔型变量
        System.out.println(flag);



    }
}
