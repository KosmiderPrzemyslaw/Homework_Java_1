package day_3;

public class Main2 {
    public static void main(String[] args) {
        String[] strings = {"Andrzej", "Mariusz", "Włodek", "Kazik"};

        try {
            System.out.println(safeGet(strings,2));
            System.out.println(safeGet(strings,7));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static String safeGet(String[] strings, int index) {
        return strings[index];
    }
}
