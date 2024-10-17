package org.jdekha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean ascending(String str) {
        str = str.replaceAll(" ", "");
        int offSet = 1;
        boolean ordonne = false;
        while (!ordonne && offSet <= str.length() / 2) {
            if (str.length() % offSet != 0) {
                offSet++;
            }
            else {
                String regExp = "\\d{" + offSet + "}";
                Pattern pattern = Pattern.compile(regExp);
                Matcher matcher = pattern.matcher(str);
                matcher.find();
                int val = Integer.parseInt(matcher.group());
                ordonne = true;
                while (ordonne && matcher.find()) {
                    int val2 = Integer.parseInt(matcher.group());
                    ordonne = val2 == val + 1;
                    val = val2;
                }
                offSet++;
            }
        }
        return ordonne;
    }

    public static boolean ascending4(String str) {
        // ascending2("1111 1112 1113 1114 1115");
        str = str.replaceAll(" ", "");
        int taille = str.length();
        int offSet = 1;
        boolean trouve = false;
        while (!trouve && offSet <= taille / 2) {
            if (taille % offSet != 0) {
                offSet++;
                continue;
            }
            String s = "";
            for (int i = 0; i < taille && offSet <= taille / 2; i += offSet) {
                s += str.substring(i, i + offSet) + " ";
            }
            String[] tab = s.split(" ");
            int[] t = Stream.of(tab).mapToInt(Integer::valueOf).toArray();
            boolean ordonne = true;
            for (int i = 0; i < t.length - 1 && ordonne; i++) {
                ordonne = t[i] + 1 == t[i + 1];
            }
            trouve = ordonne;
            offSet++;
        }
        return trouve;
    }

    public static boolean ascending2(String str) {
        str = str.replaceAll(" ", "");
        int offSet = 1;
        boolean ordonne = false;
        while (!ordonne && offSet <= str.length() / 2) {
            String s = "";
            while (str.length() % offSet != 0 && offSet <= str.length() / 2) {
                offSet++;
            }
            if (offSet > str.length() / 2) {
                return false;
            }
            String regExp = "\\d{" + offSet + "}";
            Pattern pattern = Pattern.compile(regExp);
            Matcher matcher = pattern.matcher(str);
            int i1 = 0;
            int i2 = 0;
            if (matcher.find()) {
                System.out.println(matcher.group());
                i1 = Integer.parseInt(matcher.group());
            }
            ordonne = true;
            while (ordonne && matcher.find()) {
                System.out.println(matcher.group());
                i2 = Integer.parseInt(matcher.group());
                ordonne = i2 == i1 + 1;
                i1 = i2;
            }
            offSet++;
        }
        return ordonne;
    }

    public static boolean ascending3(String str) {
        str = str.replaceAll(" ", "");
        int offSet = 1;
        boolean ordonne = false;
        while (!ordonne && offSet <= str.length() / 2) {
            if (str.length() % offSet != 0) {
                offSet++;
            }
            else {
                String regExp = "\\d{" + offSet + "}";
                Pattern pattern = Pattern.compile(regExp);
                Matcher matcher = pattern.matcher(str);
                int i = 0;
                int taille = str.length() / offSet;
                int[] tab = new int[taille];
                while (matcher.find()) {
                    String gr = matcher.group();
                    tab[i++] = Integer.parseInt(gr);
                }
                ordonne = true;
                for (i = 0; i < taille - 1 && ordonne; i++) {
                    ordonne = tab[i] + 1 == tab[i + 1];
                }
                offSet++;
            }
        }
        return ordonne;
    }
}