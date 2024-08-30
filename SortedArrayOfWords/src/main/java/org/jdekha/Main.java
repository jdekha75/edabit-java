package org.jdekha;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }



    public static boolean isSorted(String[] words, String alpha) {
        Comparator<String> comparateur = (s, t) -> {
            int i1 = alpha.indexOf(s.charAt(0) + "");
            int i2 = alpha.indexOf(t.charAt(0) + "");
            boolean ordonne = i1 <= i2;
            boolean same = i1 == i2;
            int i = 1;
            while (i < s.length() && i < t.length() && same) {
                i1 = alpha.indexOf(s.charAt(i) + "");
                i2 = alpha.indexOf(t.charAt(i) + "");
                ordonne = i1 <= i2;
                same = i1 == i2;
                i++;
            }
            //  System.out.println(s + "  " + t + " " + ordonne);
            if (same && s.length() == t.length()) {
                return 0;
            }
            if (same && s.length() > t.length() || !ordonne) {
                return 1;
            }
            if (ordonne) {
                return -1;
            }
            return 1; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        };
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(Stream.of(words).sorted(comparateur).toArray(String[]::new)));
        return Arrays.deepEquals(words, Stream.of(words).sorted(comparateur).toArray(String[]::new));
    }
//        return Arrays.deepEquals(words, Stream.of(words).sorted(new Comparator<String>() {
//            @Override
//            public int compare(String s, String t) {
//                int i1 = alpha.indexOf(s.charAt(0) + "");
//            int i2 = alpha.indexOf(t.charAt(0) + "");
//            boolean ordonne = i1 <= i2;
//            boolean same = i1 == i2;
//            int i = 1;
//            while (i < s.length() && i < t.length() && same) {
//                i1 = alpha.indexOf(s.charAt(i) + "");
//                i2 = alpha.indexOf(t.charAt(i) + "");
//                ordonne = i1 <= i2;
//                same = i1 == i2;
//                //System.out.println(ordonne);
//                i++;
//            }
//            System.out.println(s + "  " + t + " " + ordonne);
//            if (ordonne || same && s.length() <= t.length())
//                return -1;
//
//            return 1;
//            }
//        }).toArray(String[]::new));
//
        public static boolean isSorted2(String[] words, String alpha) {
       Comparator<String> comparateur = (s, t) -> {
            int i1 = alpha.indexOf(s.charAt(0) + "");
            int i2 = alpha.indexOf(t.charAt(0) + "");
            boolean ordonne = i1 <= i2;
            boolean same = i1 == i2;
            int i = 1;
            while (i < s.length() && i < t.length() && same) {
                i1 = alpha.indexOf(s.charAt(i) + "");
                i2 = alpha.indexOf(t.charAt(i) + "");
                ordonne = i1 <= i2;
                same = i1 == i2;
                i++;
            }
            //  System.out.println(s + "  " + t + " " + ordonne);
            if (same && s.length() == t.length()) {
                return 0;
            }
            if (same && s.length() > t.length() || !ordonne) {
                return 1;
            }
            if (ordonne) {
                return -1;
            }
            return 1; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/LambdaBody
        };
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(Stream.of(words).sorted(comparateur).toArray(String[]::new)));
        return Arrays.deepEquals(words, Stream.of(words).sorted(comparateur).toArray(String[]::new));
//        return Arrays.deepEquals(words, Stream.of(words).sorted(new Comparator<String>() {
//            @Override
//            public int compare(String s, String t) {
//                int i1 = alpha.indexOf(s.charAt(0) + "");
       // return words.length == Stream.of(words).sorted(comparateur).toArray(String[]::new).length;
    }
}