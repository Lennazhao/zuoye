public class Example04 {
    public static void main(String[] args) {
        int x = 12;
        {
            int y = 96;                             //y的作用域只能作用于{}
            System.out.println("x is" + x);
            System.out.println("y is" + y);
        }
          //y = x;
        System.out.println("x is" + x);
    }
}
