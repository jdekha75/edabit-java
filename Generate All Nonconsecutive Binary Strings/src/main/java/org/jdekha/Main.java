package org.jdekha;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(generate(6));
        Object[] o = new Object[] {new Object[] {"deep"}, new Object[] {new Object[] {new Object[] {"ocean"}}}, new Object[] {new Object[] {"Marge"}}, new Object[] {"rase", 876}};
        System.out.println(Arrays.deepToString(o));
    }

    public static String generate(int n) {

        if (n == 0)
            return "";
        if (n == 1)
            return "0 1";
//        if ( n == 2)
//            return "00 01 10";
        String s1 = generate(n - 1);
        String str1 = Arrays.stream(s1.split(" ")).map(e -> "0" + e).collect(Collectors.joining(" "));
        String s2 = generate(n - 2);
        String str2 = Arrays.stream(s2.split(" ")).map(e -> "10" + e).collect(Collectors.joining(" "));
        return str1 + " " + str2;
    }
}