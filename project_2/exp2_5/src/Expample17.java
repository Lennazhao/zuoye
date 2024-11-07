public class Expample17 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=9;i++){
            if(i>4){
                break;
            }
            for(j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
