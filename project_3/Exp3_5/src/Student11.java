public class Student11 {
    private String name;
    private int age;
    public  Student11(){
        System.out.println("调用了无参构造方法");
    }
    public Student11(String name,int age){
        this();
        this.name = name;
        this.age = age;
    }
    public String read(){
        return "我是："+ name + "年龄" + age;
    }
}
