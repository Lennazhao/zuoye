public class Example13Dog implements Example13Action{
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }

    @Override
    public void info() {
        System.out.println("名称：" + NAME);
    }

    @Override
    public void black() {
        System.out.println("黑色");
    }
}
