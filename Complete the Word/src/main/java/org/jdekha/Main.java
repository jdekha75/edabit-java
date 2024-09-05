package org.jdekha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String initial = "butl";
        System.out.println(initial.replaceAll("", ".*"));

        String[] tab = initial.split("");
        System.out.println(String.join(".*", tab));


        initial = "b.*u.*t.*l.*";
        String word = "beautiful";
        Pattern p = Pattern.compile(initial);
        Matcher m = p.matcher(word);
        System.out.println(m.matches());

        System.out.println();
    }


    public static boolean canComplete(String initial, String word) {
        String[] tab = initial.split("");
        System.out.println(String.join(".*", tab));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < initial.length(); i++) {
            sb.append(initial.charAt(i) + "").append(".*");
        }
        initial = sb.toString();
        Pattern p = Pattern.compile(initial);
        Matcher m = p.matcher(word);
        return m.matches();
    }
}