public class Example06 {
    public static void main(String[] args) {
        System.out.println("example06");
        int x = 0;
        int y = 0;
        int z = 0;
        boolean a1;
        System.out.println((x>0));       //x>0是false
        System.out.println((y++)>1);    //y++是0，结果是false
        a1 = (x>0) & (y++>1);           //该加括号的地方加括号！！
        System.out.println(a1);
        //System.out.println((4!=3));//==,!=,<,>,<=<,>=比较运算符
        //c = (4!=3);             //比较运算符的结果是布尔值，最好加括号
        //System.out.println(c);
        /*a = (x > 0);   //& y++>1);
        System.out.println(a);
        System.out.println("y ="+ y);
        b = x>0 && z++ >1;
        System.out.println(b);
        System.out.println("z = "+ z);*/
//        System.out.println("逻辑运算符：");
//        System.out.println(a & b);      //与  （并且），a是false,b
//        System.out.println(a | b);
//        System.out.println(!a);
//        System.out.println("example06");

    }
}
