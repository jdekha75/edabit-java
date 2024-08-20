package org.jdekha;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

       bucketize("she sells abc shells by the sea", 10);//➞ ["she sells", "sea shells", "by the sea"]
//        bucketize("rich magnificent trees dotted the landscape", 12);
//        bucketize("ab bc cd", 1);
//        bucketize("she sells sea shells by the sea", 10);
//        bucketize("the mouse jumped over the cheese", 7);
        int[] tab = new int[]{7, 3, 8, 2, 3, 7, 10, 2, 7, 8, 7};
        int[] tab2 = IntStream.of(tab).distinct().toArray();
        System.out.println(Arrays.toString(tab2));
    }

    public static String[] bucketize(String s, int n) {
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