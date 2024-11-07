public class Example09 {
    public static void main(String[] args) {
        int grade = 75;
        if(grade > 80){
            System.out.println("优");
        }
        else if(grade > 70){
            System.out.println("良");
        }
        else if(grade > 60){
            System.out.println("中");
        }
        else{
            System.out.println("差");
        }
        System.out.println("三元运算符:");
        int x =0;
        int y = 1;
        int max = x>y? x:y;
        System.out.println(max);
    }
}
