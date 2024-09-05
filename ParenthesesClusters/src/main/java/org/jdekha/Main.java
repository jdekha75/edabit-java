package org.jdekha;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(split("()()()")).count());
    }

    public static String[] split(String str) {
        int count = 0;
        int position = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                count++;
            else {
                count--;
                if (count == 0) {
                    s.append(str, position, i + 1).append(" ");
                    position = i + 1;
                }
            }
        }
        if (s.isEmpty()) {
            return new String[]{};
        }
        return s.toString().split(" ");
    }
}