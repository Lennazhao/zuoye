public class Example11Dog implements Example11Animal, Example11Action {
    public void eat() {
        System.out.println("喜欢吃骨头");
    }

    public void shout() {
        System.out.println("汪汪汪");
    }

    public void info() {
        System.out.println("名称:" + NAME);
    }
}