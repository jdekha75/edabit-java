package org.jdekha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(findX("4x-7=x+11"));
    }

    public static String findX(String eq) {
        String[] s = eq.replaceAll("-", "+-").split("=");
        String s0 = s[0];
        String s1 = s[1];
        long l0 = matchesN(s0);
        long l1 = matchesN(s1);
        l0 = l1 - l0;
        s0 = matchesX(s0).replace("x", "");
        s1 = matchesX(s1).replace("x", "");
        l1 = Integer.parseInt(s0) - Integer.parseInt(s1);
        if (l0 == 0 && l1 == 0) {
            eq = "Infinite solutions";
        }
        else {
            if (l1 == 0) {
                eq = "No solution";
            }
            else {
                double result = (double) l0 / l1;
                eq = String.format("x=%.2f", result);
            }
        }
        if (eq.endsWith("00")) {
            return eq.substring(0, eq.lastIndexOf("."));
        }
        return eq;
    }

    private static long matchesN(String s) {
        s = s.replaceAll("\\s", "");
        String regExp = "(-?\\d+)($|-|\\+)";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(s);
        return m.results().mapToInt(e -> Integer.parseInt(e.group(1))).summaryStatistics().getSum();
    }

    private static String matchesX(String s) {
        s = s.replaceAll("\\s", "");
        String regExp = "-?\\d*x";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(s);
        long somme = m.results().mapToInt(r -> {
            String str = r.group();
            if (str.matches("-?\\d+x")) {
                return Integer.parseInt(str.replace("x", ""));
            }
            ;
            return Integer.parseInt(str.replace("x", "1"));
        }).summaryStatistics().getSum();
        return somme + "x";
    }
}