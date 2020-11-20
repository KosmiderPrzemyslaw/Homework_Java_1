package day_2;

public class Main2 {
    public static void main(String[] args) {
        String message = "Jakaś wiadomość od cezara";
        System.out.println(encode(message, 2));
    }

    static String encode(String str, int shift) {
        char[] chars = str.toCharArray();
        int[] number = new int[str.length()];
        StringBuilder strToReturn = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            number[i] = chars[i] + shift;
            char character = (char) number[i]; //rzutowanie int na char
            strToReturn.append(character);
        }

        return strToReturn.toString();
    }
}