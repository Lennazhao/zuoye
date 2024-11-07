public class exam {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[] {11,12};
        arr[1]= new int[] {21,22,23};
        arr[2]= new int[] {31,32,33,34};

        for(int i = 0;i < arr.length;i++){

            int max = arr[i][0];
            
            for(int j = 0;j < arr[i].length; j++){
                if (arr[i][j] > max) {
                 max = arr[i][j];
               }
            }
            System.out.println(max);
        }

    }
}
