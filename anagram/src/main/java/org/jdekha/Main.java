package org.jdekha;

import java.util.Arrays;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Arrays.stream(findAnagrams("abcab", "abc")).forEach(System.out::println);
        Arrays.stream(findAnagrams("ddkkevvklcyhkvkekvdxdykkvdkevqmkevdkvkfdlvdvkkekjzx", "kdkkvev")).forEach(System.out::println);
    }

    public static int[] findAnagrams(String s, String p) {
        int taille = p.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length() - taille + 1; i++) {
            String sub = s.substring(i, i + taille);
            if (isAnag(sub, p)) {
                stringBuilder.append(i).append(",");
            }
        }
        return Arrays.stream(stringBuilder.toString().split(",")).mapToInt(Integer::valueOf).toArray();
    }

    private static boolean isAnag2(String s, String p) {
        int i = 0;
        while (i < p.length() && s.contains(p.charAt(i) + ""))
            i++;
        return i >= p.length();
    }

    private static boolean isAnag(String s, String p) {
       return Arrays.compare(s.chars().sorted().toArray(), p.chars().sorted().toArray()) == 0;
    }
}