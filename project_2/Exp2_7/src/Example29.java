public class Example29 {
    public static void main(String[] args) {
        int[] arr={10,11,13,14,15};
        int score=12;
        int[] arr2=new int [arr.length+1];
        for(int i = 0;i<3;i++){
            arr2[i]=arr[i];
        }
        arr2[2]=score;
        for(int i =3;i<arr2.length;i++){
            arr2[i]=arr[i-1];
        }
        System.out.println("添加新元素之前的arr数组：");
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]+",");
        }
        System.out.println("");
        System.out.println("添加新元素之后的arr2数组：");
        for(int i= 0; i< arr2.length;i++){
            System.out.println(arr2[i]+",");
        }
    }
}
