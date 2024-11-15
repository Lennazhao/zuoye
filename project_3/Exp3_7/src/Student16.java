public class Student16 {
    String name;
    {
        System.out.println("我是构造代码块");
    }
    static {
        System.out.println("我是静态代码块");
    }
    public Student16(){
        System.out.println("我是Student类的构造方法");
    }
}
