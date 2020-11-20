package day_1;

public class Main3 {
    public static void main(String[] args) {


        int[] mainTab = new int[50];

        for (int i = 0; i <= 49; i++) {
            mainTab[i] = i;
        }

        for (int i : mainTab) {
            String number = String.format("%02d, ", mainTab[i]);

            if (mainTab[i] % 10 == 0 & mainTab[i] != 0) {
                System.out.println();
            }
            System.out.print(number);

        }

    }
}
