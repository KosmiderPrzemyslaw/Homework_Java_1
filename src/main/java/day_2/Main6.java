package day_2;

public class Main6 {
    public static void main(String[] args) {
        String str = "Ala ma kota";
        System.out.println(replaceStr(str, "kota", "psa"));
    }
    private static String replaceStr(String str, String forReplace, String replacement){
        String[] split = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: split
             ) {
            if(s.equals(forReplace)){
                s = s.replace(s, replacement);
            }
            stringBuilder.append(s).append(" ");
        }
        return stringBuilder.toString();
    }
}
