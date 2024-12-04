public class Example16 {
    public static void main(String[] args) {
        Example16Animal an = new Example16Dog();
        Example16Dog dog = (Example16Dog) an;
        dog.shout();
        dog.eat();
    }
}
