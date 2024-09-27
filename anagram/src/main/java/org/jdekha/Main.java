package org.jdekha;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(findAnagrams("abcab", "abc")));
    }

    public static String[] findAnagrams(String s, String p) {
        int taille = p.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length() - taille + 1; i++) {
            String sub = s.substring(i, i + taille);
            if(isAnag(sub, p)){
                stringBuilder.append(i).append(",");
            }

//            if (p.contains(s.charAt(i) + "")) {
//
//            }
        }
        return stringBuilder.toString().split(",");
    }

    private static boolean isAnag(String s, String p) {
        int i = 0;
        while (i < p.length() && s.contains(p.charAt(i) + ""))
            i++;
        return i >= p.length();
    }
}