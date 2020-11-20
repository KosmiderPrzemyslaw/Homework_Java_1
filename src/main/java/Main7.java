import java.util.Arrays;
import java.util.Collections;

public class Main7 {
    public static void main(String[] args) {
        int[][] table = {
                {2, -3, 4},
                {12, -32, 12, 11},
                {3, 2, 1, 4, 5},
                {5, 9, 6, 7, 8},
                {15, 21, -36, 47, 9},
                {5, -11, 26, 7, 58},
                {45, 11, 56, -7, 88},
                {425, -531, 326, 127, 228}
        };

        int[][] table2 = {
                {1, -4, 2},
                {5, -12, 68, -1},
                {5, -2, 8, -13},
                {44, 31, 21, 19},
        };

        System.out.println(Arrays.toString(minimum(table)));
        System.out.println(Arrays.toString(min(table2)));

    }

    private static int[] min(int[][] arr) {
        int[] min = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            min[i] = arr[i][0];
        }
        return min;
    }

    private static int[] minimum(int[][] arr) {
        int[] min = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
            min[i] = arr[i][0];
        }

        return min;

    }
}
