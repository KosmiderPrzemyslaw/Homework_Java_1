package day_3;

public class Main1 {
    public static void main(String[] args) {
        String a = "4";
        String b = "2";
        try {
            average(a,b);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }
    }

    public static void average(String a, String b) {
        System.out.println(Integer.parseInt(a) / Integer.parseInt(b));
    }

}
