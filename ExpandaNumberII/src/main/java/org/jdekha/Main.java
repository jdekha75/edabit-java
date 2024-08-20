package org.jdekha;

import java.io.ObjectInputStream;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(expandedForm(1234.567));
        //IntStream.concat(IntStream.range(0, 5), IntStream.range(6, 9)).forEach(System.out::println);
    }

    public static String expandedForm2(double n) {

        //    String[] s = (n + "").split("\\.");
        String[] s = String.valueOf(n).split("\\.");

        String s1 = IntStream.range(0, s[0].length()).mapToObj(i -> {

            if (s[0].charAt(i) == '0')
                return null;
            String s2 = (Integer.parseInt(s[0].charAt(i) + "") * (int) Math.pow(10, s[0].length() - i - 1)) + "";
            return s2;
        }).filter(e -> e != null).collect(Collectors.joining(" + "));

        String s2 = IntStream.range(0, s[1].length()).mapToObj(i -> {
            if (s[1].charAt(i) == '0')
                return null;
            String s3 = s[1].charAt(i) + "/" + (int) Math.pow(10, i + 1);
            return s3;
        }).filter(Objects::nonNull).collect(Collectors.joining(" + "));
        s1 = s1.isBlank() ? "" : s1 + " + ";
        return s1 + s2;
    }

    public static String expandedForm(double n) {

        StringBuilder sb = new StringBuilder();
        String s = n + "";
        int pos = s.indexOf('.');
        for (int i = 0; i < pos; i++) {
            sb.append(s.charAt(i)).append("0".repeat(pos - i - 1)).append(" + ");
        }
        for (int i = 1; i < s.length() - pos; i++) {
            sb.append(s.charAt(pos + i)).append("/1").append("0".repeat(i)).append(" + ");
        }
        //System.out.println(sb.toString());
        //return sb.toString().replaceAll("((\\+ )?0+(/10+)? )", "");
        return sb.substring(0, sb.lastIndexOf(" + ")).replaceAll("((^| )0+(/1(0)+)? \\+?)", "").trim();
    }

    public static String expandedForm4(double n) {

        StringBuilder sb = new StringBuilder();
        String s = n + "";
        int pos = s.indexOf('.');
        int i = 0;
        for (i = 0; i < pos; i++) {
            sb.append(s.charAt(i)).append("0".repeat(pos - i - 1)).append(" + ");
        }
        i++;
        for (; i < s.length(); i++) {
            sb.append(s.charAt(i)).append("/1").append("0".repeat(i - pos)).append(" + ");
        }
        return sb.substring(0, sb.lastIndexOf(" + ")).replaceAll("((^| )0+(/\\d+)? \\+)", "").trim();
    }

    public static String expandedForm5(double n) {

        //    String[] s = (n + "").split("\\.");
        String[] s = String.valueOf(n).split("\\.");

        String s1 = IntStream.range(0, s[0].length()).mapToObj(i -> {

            if (s[0].charAt(i) == '0')
                return null;
            String s2 = (Integer.parseInt(s[0].charAt(i) + "") * (int) Math.pow(10, s[0].length() - i - 1)) + "";
            return s2;
        }).filter(e -> e != null).collect(Collectors.joining(" + "));

        String s2 = IntStream.range(0, s[1].length()).mapToObj(i -> {
            if (s[1].charAt(i) == '0')
                return null;
            String s3 = s[1].charAt(i) + "/" + (int) Math.pow(10, i + 1);
            return s3;
        }).filter(Objects::nonNull).collect(Collectors.joining(" + "));
        s1 = s1.isBlank() ? "" : s1 + " + ";
        return s1 + s2;
    }


    //solution sur edabit
    public static String expandedForm6(double n) {

    String[] r = (n+"").split("\\."),
            a = IntStream.range(1, r[0].length()+1).mapToObj(i -> r[0].charAt(i-1) + new String(new char[r[0].length()-i])
                            .replace("\0", "0"))
                    .filter(k -> Integer.parseInt(k) > 0).toArray(String[]::new),
            b = IntStream.range(0, r[1].length()).mapToObj(i -> r[1].charAt(i) + "/1" + new String(new char[i+1])
                    .replace("\0", "0")).toArray(String[]::new);
    return String.join(" + ", Stream.concat(Stream.of(a), Stream.of(b)).toArray(String[]::new)).replaceAll("0/\\d+ \\+ ", "");

    }
    }