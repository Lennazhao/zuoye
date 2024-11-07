public class Season {
    public static void main(String[] args) {
        int season = 2;
        switch (season){
            case 1:
                System.out.println("春季");
                break;
            case 2:
                System.out.println("夏季");
                break;
            case 3:
                System.out.println("秋季");
                break;
            case 4:
                System.out.println("冬季");
                break;
            default:
                System.out.println("无效季节");
                break;
        }
    }
}
