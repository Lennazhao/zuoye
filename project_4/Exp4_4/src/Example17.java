public class Example17 {
    public static void main(String[] args) {
        Example17Animal a1 = new Example17Dog();
        System.out.println("Animal a1 = new Dog()" + (a1 instanceof Example17Animal));
        System.out.println("Animal a1 = new Dog()" + (a1 instanceof Example17Dog));
        System.out.println("Animal a1 = new Dog()" + (a1 instanceof Example17Cat));
        System.out.println(a1 instanceof Example17Cat);
        Example17Animal a2 = new Example17Animal();
        System.out.println("Animal a2 = new Animal()" + (a2 instanceof Example17Animal));
        System.out.println("Animal a2 = new Animal()" + (a2 instanceof Example17Dog));
    }
}
