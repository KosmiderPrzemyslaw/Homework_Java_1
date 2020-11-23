package day_2;

public class Main5 {
    public static void main(String[] args) {
        String str = "for replace String";
        System.out.println(replaceChar(str, 'o', 'k'));
    }

    private static String replaceChar(String str, char forReplace, char replacement) {
        char[] strToCharArray = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : strToCharArray
        ) {
            if (c == forReplace) {
                c = replacement;
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
