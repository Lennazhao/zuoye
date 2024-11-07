public class Example01 {
    public static void main(String[] args) {
        int num = 128;                //int占用4个字节       -2^31~2^
        //byte b = num;                //byte占用1个字节
        byte b = (byte) num;
        System.out.println(b);
    }
}
