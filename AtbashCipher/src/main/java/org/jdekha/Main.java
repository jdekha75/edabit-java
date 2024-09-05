package org.jdekha;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(atbash("apple333"));
    }

    public static String atbash(String str) {
        return str.codePoints().map(c -> {
            if (Character.isUpperCase(c))
                return 2 * ('Z' - 13) - c + 1;
            if (Character.isLowerCase(c))
                return 2 * ('z' - 13) - c + 1;
            return c;
        }).mapToObj(Character::toString).collect(Collectors.joining());
    }
}