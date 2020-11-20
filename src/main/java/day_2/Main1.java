package day_2;

public class Main1 {
    public static void main(String[] args) {
        String message = "Jakaś wiadomość od cezara";
        System.out.println(encode(message));
}

    static String encode(String str) {
        char[] chars = str.toCharArray();
        int[] number = new int[str.length()];
        StringBuilder strToReturn = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            number[i] = chars[i] + 3;
            char character = (char) number[i]; //rzutowanie int na char
            strToReturn.append(character);
        }

        return strToReturn.toString();
    }
}
