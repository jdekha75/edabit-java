package org.jdekha;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String s = "aaaa     baaa!aaaa";
        System.out.println(s.length());
        s = unrepeated(s);
        System.out.println(s);
        System.out.println(s.length());
    }

    public static String unrepeated(String str) {

        return str.codePoints().distinct().mapToObj(Character::toString).collect(Collectors.joining());
    }
}