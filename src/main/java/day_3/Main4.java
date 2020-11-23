package day_3;

public class Main4 {
    public static void main(String[] args) {
        try {
            System.out.println(toInt("napis"));
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }

    private static int toInt(String string) {
        return Integer.parseInt(string);
    }
}
