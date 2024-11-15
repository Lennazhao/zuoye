public class Example13 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("张三",18);
        Student stu3 = new Student("张三",18);
        stu1.info();
        stu2.info();
        stu3.info();
        stu1.school = "B大学";
        stu1.school="江南影视艺术";
        System.out.println("修饰stu1对象的学生信息为大学后");
        stu1.info();
        stu2.info();
        stu3.info();
    }
}
