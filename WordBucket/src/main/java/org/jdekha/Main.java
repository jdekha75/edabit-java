package org.jdekha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(bucketize("she sells sea shells by the sea", 2)));//➞ ["she sells", "sea shells", "by the sea"]
//        bucketize("rich magnificent trees dotted the landscape", 12);
//        bucketize("ab bc cd", 1);
//        bucketize("she sells sea shells by the sea", 10);
//        bucketize("the mouse jumped over the cheese", 7);
        int[] tab = new int[]{7, 3, 8, 2, 3, 7, 10, 2, 7, 8, 7};
        int[] tab2 = IntStream.of(tab).distinct().toArray();
        // System.out.println(Arrays.toString(tab2));
        System.out.println(Arrays.deepToString(Main.bucketize("beep bo bee bop bee bo bo bop", 6)));
        System.out.println("rich magnificent trees dotted the landscape".length());
        System.out.println(Arrays.deepToString(Main.bucketize("rich magnificent trees dotted the landscape", 43)));
        System.out.println(Arrays.deepToString(Main.bucketize("rich magnificent trees dotted the landscape", 22)));
    }

    public static String[] bucketize(String str, int n) {
        String[] tab = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int taille = 0;
        for (String s : tab) {
            taille += s.length();
            if (s.length() <= n && taille <= n) {
                sb.append(" ").append(s);
            } else if (s.length() <= n) {
                sb.append("\n").append(s);
                taille = s.length();
            }
            taille++;
        }
        return sb.toString().trim().split("\n");
    }

    public static String[] bucketize1(String s, int n) {
        StringBuilder sb = new StringBuilder();
        String str = s.substring(0, n);
        boucle:
        while (s.length() > n) {
            char c = s.charAt(n);
            if (c == ' ') {
                s = s.substring(n + 1);
            } else {
                int i = new StringBuilder(str).reverse().indexOf(" ");
                System.out.println(i);
                if (i != -1) {
                    str = s.substring(0, str.length() - i);
                    s = s.substring(n - i);
                } else
                    // n = s.length();
                    break boucle;
            }
            sb.append(str.trim()).append("\n");
            str = s.substring(0, Math.min(s.length(), n));
        }
        if (!s.isBlank() && s.length() <= n)
            sb.append(str).append("\n");
        else
            sb.append("");
        return sb.toString().split("\n");
    }

    public static String[] bucketize2(String s, int n) {
        String str = "";
        String string = "";
        for (int i = 0; i < s.length(); ) {
            int cmpt = 0;
            int index = 0;
            str = "";
            while (cmpt < n && i < s.length()) {
                char c = s.charAt(i);
                if (c != ' ') {
                    str += c;
                    cmpt++;
                } else {
                    index = i;
                    string += str + " ";
                    str = "";
                }
                i++;
//                System.out.println(i + str + cmpt);
            }

            if (i < s.length() && s.charAt(i) != ' ') {
                i = index + 1;
                string = string.trim() + "\n";

            } else if (i >= s.length() || s.charAt(i) == ' ') {
                string += str + "\n";
                str = "";
            }
            System.out.println(string);
        }
        System.out.println(string);
        return string.split("\n");
    }
}