public class Example30 {
    public static void main(String[] args) {
        int [] arr = {9,8,3,5,2};
        for(int i = 0 ; i<arr.length;i++){
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
        for(int i = 1;i < arr.length;i++) {
            for (int j = 0;j<arr.length-j;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (int i = 0;i< arr.length;i++){
            System.out.printf(arr[i]+" ");
        }
    }
}
