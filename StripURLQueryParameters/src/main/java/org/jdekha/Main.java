package org.jdekha;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "hello world";
        System.out.println(Stream.of(s.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting())));
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&b=4", null));
    }

    public static String stripUrlParams(String url, String[] paramsToStrip) {
        //"https://edabit.com?a=1&b=2&b=4"
        String[] tab = url.split("\\?");
        if (tab.length == 1) {
            return url;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Function<String, String> key = s -> s.split("=")[0];
        Function<String, String> val = s -> s.split("=")[1];
        BinaryOperator<String> stringBinaryOperator = BinaryOperator.maxBy(String::compareTo);
        BiConsumer<String, String > biConsumer = (s1, s2) -> stringBuilder.append(s1).append("=").append(s2).append("&");
        Stream.of(tab[1].split("&")).filter(e -> {
            return paramsToStrip == null ?
                    Stream.empty().noneMatch(x -> x.equals(e.charAt(0) + ""))
                    : Stream.of(paramsToStrip).noneMatch(x -> x.equals(e.charAt(0) + "")) ;
        }).collect(Collectors.toMap(key, val, stringBinaryOperator)).forEach(biConsumer);
        String s = stringBuilder.toString();
        return tab[0] + "?" + s.substring(0, s.lastIndexOf("&"));
    }
}