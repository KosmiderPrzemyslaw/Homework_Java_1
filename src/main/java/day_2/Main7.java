package day_2;

public class Main7 {
    public static void main(String[] args) {
        String str = "Co za baran z tego osła niepoważnego";
        String[] words = {"baran", "osła", "niepoważnego"};

        System.out.println(censor(str, words));

    }
    static String censor(String str, String[] words){
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if(split[i].equals(words[j])){
                    split[i] = "****";
                }
            }
        }
        return String.join(" ", split);
    }
}
