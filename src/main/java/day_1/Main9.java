package day_1;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        int[] table = {1, 2, 4, 5};

        System.out.println(Arrays.toString(append(table)));
    }

    static int[] append(int[] arr) {
        int[] reversed = new int[arr.length];
        int[] tab = Arrays.copyOf(arr, arr.length * 2);
        int k = tab.length - arr.length;


        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversed));

        int[] arrTmp = new int[tab.length - k + reversed.length];
        System.out.println(Arrays.toString(arrTmp));

        System.arraycopy(tab, 0, arrTmp, 0, tab.length - k);
        System.arraycopy(reversed, 0, arrTmp, tab.length - k, reversed.length);
        return arrTmp;
    }
}

//    public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//
//        src − This is the source array.
//        srcPos − This is the starting position in the source array.
//        dest − This is the destination array.
//        destPos − This is the starting position in the destination data.
//        length − This is the number of array elements to be copied.
//
