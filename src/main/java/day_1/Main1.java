package day_1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(dogAge(1));
        System.out.println(dogAge(2));
        System.out.println(dogAge(3));
        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));
    }

    static double dogAge(double dogAge) {
        double result;

        if(dogAge <= 2){
                result = dogAge * 10.5;

        }
        else {
            result = (dogAge - 2) * 4 + (2*10.5);
        }

        return result;
    }
}
