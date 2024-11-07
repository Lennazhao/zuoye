public class Student {
    private String name;
    private int age;
    public Student(String n,int a){
        name = n;
        age = a;
        String temp = "构造方法："+ this.read();
        System.out.println(temp);
    }
    public String read(){
        return "我是：" + name + ",年龄：" + age;
    }

}
