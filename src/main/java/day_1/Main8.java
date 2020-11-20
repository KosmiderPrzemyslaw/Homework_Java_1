package day_1;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        int[][] table = {
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4},
                {0, 1, 2, 3, 4},
        };


        System.out.println(Arrays.toString(lessMore(table)));
    }

    static int[] lessMore(int[][] arr) {
        int average = 0;
        int sum = 0;
        int arrTableSize = 0;
        int numberOfElementsBiggerThanAverage = 0;
        int numberOfElementsSmallerThanAverage = 0;
        int[] result = new int[2];

        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                sum += ints[j];
                arrTableSize++;
            }
        }
        average = sum / arrTableSize;
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                if (ints[j] > average) {
                    numberOfElementsBiggerThanAverage++;
                } else if (ints[j] < average) {
                    numberOfElementsSmallerThanAverage++;
                }
            }


        }
        System.out.println(average);
        result[0] = numberOfElementsSmallerThanAverage;
        result[1] = numberOfElementsBiggerThanAverage;
        return result;
    }
}
