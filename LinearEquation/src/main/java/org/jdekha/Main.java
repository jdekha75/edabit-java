package org.jdekha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    }

    public static String findX(String eq) {
        //FindX("4x-7=x+11") ➞ "x=6"
        String[] s = eq.split("=");
        String s0 = s[0];
        String s1 = s[1];
        long l0 = matchesN(s0);
        System.out.println(l0);
        long l1 = matchesN(s1);
        System.out.println(l1);
        l0 = l1 - l0;
        System.out.println(l0);
        s0 = matchesX(s0).replace("x", "");
        System.out.println(s0);
        s1 = matchesX(s1).replace("x", "");
        System.out.println(s1);
        l1 = Integer.parseInt(s0) - Integer.parseInt(s1);
        System.out.println(l1);
        if (l0 == 0 && l1 == 0) {
            eq = "Infinite solutions";
        }
        else {
            if (l1 == 0) {
                eq = "No solution";
            }
            else {
                eq = l0 / l1 + "";
            }
        }
        //s0 = l0 < 0 ? s0 + l0 : s0 + "+" + l0;
        //s1 = l1 < 0 ? s1 + l1 : s1 + "+" + l1;
        //return s0  + "=" + s1;
        return eq;
    }

    private static long matchesN(String s) {
        s = s.replaceAll("\\s", "");
        String regExp = "([-]?\\d+)(|-|\\+)";
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
//        if (somme == 0) {
//            return "0";
//        }
        return somme + "x";
    }
}