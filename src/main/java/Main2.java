public class Main2 {
    public static void main(String[] args) {
        System.out.println(isDivided(2,3));
        System.out.println(isDivided(200,10));
    }

    private static boolean isDivided(double a, double b) {
        return a % b == 0;
    }
}


