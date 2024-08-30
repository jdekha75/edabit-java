package org.jdekha;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] tab = encrypt("Hello");
        Arrays.stream(tab).forEach(System.out::println);
    }

    public static int[] encrypt(String str) {

        int[] tab = new int[str.length()];
        tab[0] = Character.codePointAt(str, 0);
        for (int i = 1; i < str.length(); i++) {
            tab[i] = Character.codePointAt(str, i) - Character.codePointAt(str, i - 1);
        }
        return tab;
    }

}