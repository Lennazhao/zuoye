public class Example06Animal {
    private String name;
    private int age;

    public Example06Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String info() {
        return "名称:" + this.getName()
                + ",年龄:" + this.getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
