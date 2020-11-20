package day_1;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main5 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        Arrays.fill(tab, 2);
        for (int element : tab
        ) {
            System.out.println("Filling the table with " + element);
        }


        List<Integer> integerList = new ArrayList<>();
        while (integerList.size() < 10) {
            int randNum = randomNumber();
            if (!integerList.contains(randNum)) {
                integerList.add(randNum);
            }
        }
        Collections.sort(integerList);
        System.out.println(integerList);
        integerList.sort(Collections.reverseOrder());
        System.out.println(integerList);

        int[] createTable = createUniqueTableByUsingJava8();
        System.out.println(Arrays.toString(createTable));

    }

    private static int[] createUniqueTableByUsingJava8() {

        return ThreadLocalRandom.current().ints(0, 10).distinct().limit(10).toArray();
    }


    //nie działa, nie losuje unikalnych liczb
    private static int[] createUniqueTable(int[] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = table.length - 1; j > 0; j--) {
                if (table[i] == table[j])
                    table[i] = randomNumber();
            }
        }
        return table;
    }


    private static int randomNumber() {
        Random random = new Random();
        return random.nextInt(20) + 1;
    }
}


