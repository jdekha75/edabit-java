package org.jdekha;

import java.util.Comparator;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(kaprekar(1));
    }

    public static int kaprekar(int num) {
        if (num == 6174) {
            return 0;
        }
        String s1 = num + "";
        s1 = s1.chars().sorted().mapToObj(Character::toString).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        //s1 = s1.codePoints().sorted().mapToObj(Character::toString).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        int length = s1.length();
        if (length < 4) {
            s1 += "0".repeat(4 - length);
        }
        int val1 = Integer.parseInt(s1);
        String s2 = new StringBuilder(s1).reverse().toString();
        /*
        String s2 = num + "";
        s2 = s2.codePoints().sorted().mapToObj(Character::toString).collect(Collectors.joining());
        System.out.println(s2);
         */
        int val2 = Integer.parseInt(s2);
        System.out.println(s1);
        System.out.println(s2);
        return 1 + kaprekar(val1 - val2);
    }
}