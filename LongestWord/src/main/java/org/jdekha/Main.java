package org.jdekha;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "I will and ever will be gratefully and perpetually loving you Tesh!😘" ;
        System.out.println(findLongest(s));
    }

    public static String findLongest(String s) {
        return Stream.of(s.split(" ")).map(String::toLowerCase)
                .flatMap(e -> Stream.of(e.split("[^a-z]")))
                //.peek(System.out::println)
                .max(Comparator.comparingInt(String::length)).get().toString();
    }


/*

 */

    public static String findLongest1(String s) {
        Pattern p = Pattern.compile("(\\S+)\\s(\\S+)");
        Matcher m = p.matcher(s);

        m.matches();

        String s11 = m.group(1);
        String s21 = m.group(2);

        if (m.matches()){
            String s1 = m.group(1);
            String s2 = m.group(2);
            return s1.length() >= s2.length() ? s1 : s2;
        }

        else{
            ;
        }
        return  s;
    }
}