package org.jdekha;

import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static int incDec(int n) {

        int nbre = (int) Math.pow(10, n);

//        Predicate<String> prdct = s -> {
//            return s.matches("[^0]+0+");
//        };
        Predicate<String> prdct1 = (s -> {
            return IntStream.rangeClosed(0, s.length() - 2).allMatch(i -> {
                return s.charAt(i) <= s.charAt(i + 1);
            });
//            boolean bool = s.charAt(0) <= s.charAt(s.length() - 1);
//            char min = s.charAt(0);
////          return s.chars().noneMatch( c -> {
//            return s.chars().allMatch(c -> {
//                return (Character.getNumericValue(c) >= min);
//            });
        });

        Predicate<String> prdct2 = (s -> {

            return IntStream.rangeClosed(0, s.length() - 2).allMatch(i -> {
                return s.charAt(i) >= s.charAt(i + 1);
            });
        });
        Set<String> set = IntStream.rangeClosed(1, nbre).mapToObj(String::valueOf).filter(prdct1).collect(Collectors.toSet());
        set.addAll(  IntStream.rangeClosed(1, nbre).mapToObj(String::valueOf).filter(prdct2).collect(Collectors.toSet()));
        System.out.println( "set " + set.size());
        IntStream.rangeClosed(1, nbre).mapToObj(String::valueOf).filter(prdct1).forEach(System.out::println);
        IntStream.rangeClosed(1, nbre).mapToObj(String::valueOf).filter(prdct2).forEach(System.out::println);
        return (int) IntStream.rangeClosed(1, nbre).mapToObj(String::valueOf).filter(prdct1).count() + (int) IntStream.rangeClosed(1, nbre).mapToObj(String::valueOf).filter(prdct2).count();

    }

    public static int incDec1(int n) {

        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < n; x++) {
            for (int i = 1; i < 10; i++) {
                if (x < 1) {
                    sb.append(i + "\n");
                }
                for (int j = i; j < 10 && n > 1; j++) {
                    if (x < 1) {
                        sb.append(i + "" + j + "\n");
                    }
                    for (int k = j; k < 10 && n > 2; k++) {
                        sb.append(i + "" + j + "" + k + " ");
                    }
                    sb.append("\n");
                }
                sb.append("\n");

            }
        }
        System.out.println(sb);

//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < 10; j++) {
//                    int x = 0;
//                    for (int l = i; l > 0; l--) {
//                        x += (int) Math.pow(10, l) * j;
//                    }
//                    for (int l = x + j; l < x + 10 ; l++) {
//                        System.out.print(l + " ");
//                    }
//
//                System.out.println("");
//            }
//        }
        return 1;
    }
}