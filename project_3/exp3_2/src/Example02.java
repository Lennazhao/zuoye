public class Example02 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = null;
        stu2 = stu1;
        stu1.name = "小明";
        stu1.age = 20;
        stu2.age = 50;
        stu1.read();
        stu2.read();
    }
}
