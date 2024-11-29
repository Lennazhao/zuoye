public class Example12Dog extends Example12Action implements Example12Animal {
    @Override
    public void eat() {
        System.out.println("喜欢吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }

    @Override
    public void info() {
        System.out.println("名称:" + NAME);
    }
}
