public class Example01 {
    public static void main(String[] args ){
        Dog dog = new Dog();
        dog.setName("牧羊犬");
        dog.setAge(3);
        dog.setColor("白色");
        System.out.println("名称："+ dog.getName() +
                            "，年龄："+ dog.getAge()
                            + ",父类颜色："+ dog.COLOR
                            + ",子类颜色：" + dog.getColor());
    }
}
