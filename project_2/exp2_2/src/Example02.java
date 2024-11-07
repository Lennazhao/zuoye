public class Example02 {
    public static void main(String[] args) {
        byte a;                         //byte 占用1个字符
        int b = 298;                    //int  占用4个字符
        a = (byte) b;
        System.out.println("b = "+b);
        System.out.println("a = "+a);
    }
}
