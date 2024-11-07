public class Eapample18 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=5;i++){
            if(i % 2==0){
                continue;
            }
            sum+=i;
        }
        System.out.println("sum="+sum);
    }
}
