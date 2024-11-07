public class Test {
    public static void main(String[] args) {
        int num = 0;
        while (num < 10){
            if(num % 2 !=0){
                System.out.println(num+",");
            }
            num++;
        }
        System.out.println("");
        int num2=0;
        do {
            if (num2 %2 !=0){
                System.out.println(num2+",");
            }
            num2++;
        }while (num2<=10);
        System.out.println("");
        for (int i = 1;i <=10;i++){
            if(i%2!=0){
                System.out.println(i+" ");
            }
        }
    }
}
