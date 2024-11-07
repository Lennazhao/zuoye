public class Div {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 6, 3, 9, 8};

        for (int number : numbers) {
            if (number % 3 != 0) {
                System.out.print(number + " ");
            }
        }
    }
}