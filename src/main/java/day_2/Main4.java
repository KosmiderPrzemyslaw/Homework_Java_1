package day_2;

public class Main4 {
    public static void main(String[] args) {
        String str = "faaalllaaafellkiii";

        System.out.println(triple(str));
    }

    private static int triple(String str) {
        char[] chars = str.toCharArray();
        int counter = 0;
        for (int i = 2; i < chars.length; i++) {
            if(chars[i-2] == chars[i-1] && chars[i-1] == chars[i]){
                counter++;
            }
        }
        return counter;
    }
}
