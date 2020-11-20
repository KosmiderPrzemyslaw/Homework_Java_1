public class Main10 {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(oddSum(arr));
    }

    static int oddSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 == 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
