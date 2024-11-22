public class Example05Dog extends Example05Animal{
    @Override
    void shout() {
        System.out.println("汪汪汪...");
    }

    public void printName() {
        System.out.println("名字：" + super.name);
    }
}
