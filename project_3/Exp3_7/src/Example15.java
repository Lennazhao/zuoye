public class Example15 {
    public static void main(String[] args) {
        Student15 stu1 = new Student15("张三", 18);
        Student15 stu2 = new Student15("李四", 18);
        Student15 stu3 = new Student15("王五", 18);
        System.out.println("-----修改前------");
        stu1.info();
        stu2.info();
        stu3.info();
        System.out.println("------修改后-----");
        Student15.setSchool("B大学");
        stu1.info();
        stu2.info();
        stu3.info();
    }
}
