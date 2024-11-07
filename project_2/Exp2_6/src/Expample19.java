public class Expample19 {
    public static void main(String[] args) {
        printRectangle(2,3);
        printRectangle(5,5);
        printRectangle(6,10);
    }

         public static void printRectangle(int height ,int width){
             for(int i=0;i<=height;i++){
                 for(int j=0;j<width;j++){
                     System.out.printf("*");
                 }
                 System.out.printf("\n");
             }
            System.out.printf("\n");
        }
    }

