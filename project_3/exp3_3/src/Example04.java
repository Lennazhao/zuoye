public class Example04 {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(-18);
        stu.read();
        stu.setAge(18);
        stu.read();
        String name = stu.getName();
        System.out.println(name);
    }
}
