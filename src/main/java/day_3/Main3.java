package day_3;

public class Main3 {
    public static void main(String[] args) {
        try {
            System.out.println(getLength("napis"));
            System.out.println(getLength(null));
        } catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    private static int getLength(String string) {
        return string.length();
    }
}
