public class Example15 {
    public static void main(String[] args) {
        Example15Dog dog = new Example15Dog();
        Example15Animal an = dog;
        an.shout();
        dog.eat();
    }
}
