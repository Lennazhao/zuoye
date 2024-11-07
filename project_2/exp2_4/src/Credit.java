public class Credit {
    public static void main(String[] args) {
        int creditCode = 650;
        if(creditCode>=350&&creditCode<=549){
            System.out.println("等级:较差");
        }else if(creditCode>=550&&creditCode<=599){
            System.out.println("等级：中等");
        }else if(creditCode>=600&&creditCode<=649){
            System.out.println("等级：良好");
        }else if(creditCode>=650&&creditCode<=699){
            System.out.println("等级：优秀");
        }else if(creditCode>=700&&creditCode<=950){
            System.out.println("等级：极好");
        }else {
            System.out.println("无效的信用分数");
        }
    }
}
