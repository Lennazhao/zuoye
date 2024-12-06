public class Example20 {
    public static void main(String[] args) {
        Example20Outer example20Outer = new Example20Outer();
        Example20Outer.Inner inner = example20Outer.new Inner();
        inner.show1();
        example20Outer.test2();
    }
}
