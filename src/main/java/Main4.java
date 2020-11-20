import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randomNumbers = new int[20];

        for (int i = 0; i < 20; i++) {
            randomNumbers[i] = random.nextInt(201);
            double randOff = Math.round(randomNumbers[i] * 100.0) / 100.0;
            System.out.println(String.format("%.2f", randOff));
        }
        for (int randomNumber : randomNumbers
        ) {
            Arrays.sort(randomNumbers);

            System.out.print(String.format("%03d \t", randomNumber));
        }

        System.out.println("\n----------------------");
        double d = 2.34468;
        DecimalFormat dFormat = new DecimalFormat("##.000");
        DecimalFormat decimalFormat = new DecimalFormat("##.00");

        System.out.println(dFormat.format(d));
        System.out.println(decimalFormat.format(d));

        BigDecimal a = new BigDecimal(123.13698);
        BigDecimal roundOff = a.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal roundOff3 = a.setScale(3, BigDecimal.ROUND_CEILING);
        BigDecimal roundOff4 = a.setScale(3, BigDecimal.ROUND_FLOOR);
        System.out.println(roundOff);
        System.out.println(roundOff3);
        System.out.println(roundOff4);
    }

}
