import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 7, 10};
        int[] numbers2 = {2, 3, 5, 23, 34, 3};

        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] + numbers2[i];
        }
        System.out.println(Arrays.toString(result));
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

    }
}
