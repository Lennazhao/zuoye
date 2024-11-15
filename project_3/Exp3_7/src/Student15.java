public class Student15 {
    private String name;
    private int age;
    private static String School = "A大学";
    public Student15(String name ,int age){
        this.name = name ;
        this.age = age;
    }
    public void info(){
        System.out.println("姓名："+  this.name+
                            ",年龄：" +
                            this.age + "学校：" + School);
    }
    public static String getSchool(){
        return School;
    }
    public static void setSchool(String s){
        School = s;
    }
}
