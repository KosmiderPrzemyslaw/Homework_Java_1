package day_4;


import org.apache.commons.lang3.StringUtils;

import java.util.StringTokenizer;

public class Main10 {
    public static void main(String[] args) {
        String text = " tekst do podziału";
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        System.out.println(stringTokenizer.countTokens());

        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println(StringUtils.reverse(text));
        System.out.println(StringUtils.swapCase(text));
    }
}
