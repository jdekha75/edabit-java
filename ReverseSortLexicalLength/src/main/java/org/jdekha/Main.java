package org.jdekha;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(Main.reverseSort("You've rocked the pragmatic world in the making!"));
        System.out.println(Main.reverseSort("Lexical sort is similar to alphanumeric sorting"));
    }

    public static String reverseSort(String str) {
        Comparator<String> comparator1 = (s1, s2) -> {
            return Integer.compare(s2.length(), s1.length());
        };

        Comparator<String> comparator2 = String::compareToIgnoreCase;

        return Stream.of(str.split(" ")).sorted(comparator1.thenComparing(comparator2.reversed())).collect(Collectors.joining(" "));
    }
}