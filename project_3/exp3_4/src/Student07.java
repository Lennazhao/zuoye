public class Student07 {
    private String name;
    private int age;
    public Student07(){

    }
    public Student07(String n){
        name = n;
        System.out.println("调用了一个参数结构方法");
    }
    public Student07(String n , int a){
        name = n;
        age = a;
        System.out.println("调用了两个参数的构造方法");
    }
    public void read(){
        System.out.println("我是：" + name+",年龄：" + age);
    }

}
