public class Example05 {
    public static void main(String[] args) {
        System.out.println(7%5);
        int a = 2;
        int b = ++a;
        System.out.println("自增前     a="+a); //自增前 ，先计算a=a+1，后赋值
        System.out.println("自增前b=++a     b="+b); //      a=2+1=3,b+a=3

        int a1 = 2;
        int b1 = a1 ++;
        System.out.println("自增后         a1="+a1);//自增后， 先赋值b=a后计算a=a+1
        System.out.println("自增后b1=a1++  b1="+b1);//  b=a=2， a=a+1=3

        int a2 = 2;
        int b2 = --a2;
        System.out.println("自减前         a2="+a2);
        System.out.println("自减前b2=--a2  b2="+b2);

        int a3 = 2;
        int b3 = a3 --;
        System.out.println("自减前         a3="+a3);
        System.out.println("自减后b3=a3--  b3="+b3);

        System.out.println(3500/1000*1000); // 出数和被除数都是整，结果也是整数 3500/1000=3
        System.out.println(-5%3);
        System.out.println(5%-3);           //%运算符号与%的左边有关·

        int a4 = 3;
        int b4 = 2;
        a4 *= b4;                       //+=是一个整体运算符，中间不能加空格
        System.out.println("复合赋值运算"+a4);         //a4= a4+b4
        System.out.println("复合赋值运算"+b4);

        int x,y,z;
        x = y = z = 5;
        //int     x = y = z = 5;        //没有定义x y z，会报错


    }
}
