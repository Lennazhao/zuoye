public class Example26 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 5;
        System.out.println("arr[0]="+ arr[0]);
        arr = null ;
        System.out.println("arr[0]="+arr[0]);
    }
}
