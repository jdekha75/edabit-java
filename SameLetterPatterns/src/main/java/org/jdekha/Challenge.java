package org.jdekha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String str = "f1f11";
        Pattern p = Pattern.compile("\\D");
        Matcher m = p.matcher(str);
        System.out.println(m.find());
        System.out.println(sameLetterPattern("ababab", "cdcddd"));
        //System.out.println(m.results().);
    }

    public static boolean sameLetterPattern2(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            String s1 = str1.substring(i, i + 1);
            String s2 = str2.substring(i, i + 1);
            if (s1.matches("\\D")) {
                str1 = str1.replaceAll(s1, i + "");
                str2 = str2.replaceAll(s2, i + "");
            }
        }
        return str1.equals(str2);
    }

    //sur edabit
    public static boolean sameLetterPattern(String str1, String str2) {
        int i = 0;
        while (!str1.matches("\\d*") && !str2.matches("\\d*")){
            str1 = str1.replaceAll("" + str1.charAt(i), i + "");
            str2 = str2.replaceAll("" + str2.charAt(i), i + "");
            i++;
        }
        return  str1.equals(str2);
    }
}