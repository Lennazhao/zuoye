public class Example18 {
    public static void main(String[] args) {
        Example18Animal animal1=new Example18Animal();
        Example18Animal animal2=new Example18Animal();
        System.out.println(animal1.toString());
        System.out.println(animal1.equals(animal1));
        System.out.println(animal1.hashCode());
    }
}
