public class Example20Outer {
    int m = 0;
    void test1() {
        System.out.println("外部类成员方法雷test1()");
    }
    class Inner {
        int n = 1;
        void show1() {
            System.out.println("外部类成员变量m=" + m);
        }
        void show2() {
            System.out.println("外部类成员类方法show2()");
        }
    }

    void test2() {
        Inner inner = new Inner();
        System.out.println("内部类成员n=" + inner.n);
        inner.show2();
    }
}
