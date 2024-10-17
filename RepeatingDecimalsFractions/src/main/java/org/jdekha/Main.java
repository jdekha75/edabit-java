package org.jdekha;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(0.6666666666);
       bd =  bd.multiply(new BigDecimal(3.0));
        System.out.println(bd);
//        System.out.println(0.3333333 * 3);
//        System.out.println(0.66666666 * 3);
//        System.out.println(0.66666 * 3);
//        System.out.println(0.142857142857 * 7);
//        System.out.println(1.1111111111 * 9);
//        System.out.println(0.19236723672367 * 27775);
//        System.out.println(0.109733333 * 7500);
//        System.out.println(fractions("0.(6)"));
//        System.out.println(fractions("0.(142857)"));
//        System.out.println(fractions("3.(142857)"));
//        System.out.println(fractions("1.1(1)"));
       // System.out.println(fractions("0.1097(3)"));
    }

    public static String fractions(String decimal) {
        String repeat = decimal.substring(decimal.indexOf("(") + 1, decimal.length() - 1);
        if (repeat.length() < 2) {
            repeat = repeat.repeat(8);
        }
        else {
            if (repeat.length() < 4) {
                repeat = repeat.repeat(4);
            }
            else {
                repeat = repeat.repeat(2);
            }
        }
        decimal = decimal.substring(0, decimal.indexOf("(")) + repeat;
        BigDecimal bd = new BigDecimal(decimal);
        int i = 1;
        BigDecimal j;
        String s = "";
        do {
            i++;
            j = bd.multiply(new BigDecimal(i));
            s = j + "";
            System.out.println(s);
        } while (!s.matches("\\d+\\.0+") && !s.matches("\\d+\\.9{6,}\\d+"));
        s = (int) Math.ceil(j.floatValue()) + "";
        return s + "/" + i;

    }

    public static String fractions1(String decimal) {
        String repeat = decimal.substring(decimal.indexOf("(") + 1, decimal.length() - 1);
        if (repeat.length() < 2) {
            repeat = repeat.repeat(8);
        }
        else {
            if (repeat.length() < 4) {
                repeat = repeat.repeat(4);
            }
            else {
                repeat = repeat.repeat(2);
            }
        }
        decimal = decimal.substring(0, decimal.indexOf("(")) + repeat;
        double d = Double.parseDouble(decimal);
        int i = 1;
        double j;
        String s = "";
        do {
            i++;
            j = d * i;
            s = j + "";
           System.out.println(s);
        } while (!s.matches("\\d+\\.0+") && !s.matches("\\d+\\.99999+\\d+"));
        s = (int) Math.ceil(j) + "";
        return s + "/" + i;
    }
}