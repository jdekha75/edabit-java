package org.jdekha;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
    }

    public static String caesarCipher(String s, int k) {
        return s.codePoints().map(c -> {
                    if (Character.isUpperCase(c))
                        return ((c + k - 'A') % 26) + 'A';
                    if (Character.isLowerCase(c))
                        return ((c + k - 'a') % 26) + 'a';
                    return c;
                }
        ).mapToObj(Character::toString).collect(Collectors.joining());
    }
}