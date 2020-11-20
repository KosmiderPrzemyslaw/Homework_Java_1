package day_2;

public class Main3 {
    public static void main(String[] args) {
        String message = "Jakaś wiadomość od cezara";
        System.out.println(upperCase(message, 4));
    }

    static String upperCase(String str, int index) {

        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if(i % index == 0) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);
    }
}
