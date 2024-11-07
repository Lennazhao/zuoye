public class Example01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        stu1.name = "小明";
        stu1.age = 20;
        stu1.sex = "男";
        stu1.read();
        stu2.name = "李华";
        stu2.read();

    }
}
