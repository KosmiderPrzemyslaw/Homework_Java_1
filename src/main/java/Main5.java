import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main5 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        Arrays.fill(tab, 2);
        for (int element : tab
        ) {
            System.out.println(element);
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


        int[] table = new int[10];
        int[] tableToReverse = new int[10];

        for (int i = 0; i < table.length; i++) {
            if (tab[i] != tab[i] + 1){
                tab[i] = randomNumber();
            }
        }

        tableToReverse = createUniqueTable(table);

        for (int elem: tableToReverse
             ) {
            System.out.print(elem + " ");
        }


        int [] tableToConvert = createUniqueTableByUsingJava8();

    }

    private static int[] createUniqueTableByUsingJava8() {

        ThreadLocalRandom.current().ints(0,10).distinct().limit(10).forEach(System.out :: println);
        return new int[0];
    }


    //nie działa, nie losuje unikalnych liczb
    private static int [] createUniqueTable(int[] table) {
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


