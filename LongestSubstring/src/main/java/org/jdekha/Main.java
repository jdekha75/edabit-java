package org.jdekha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(longest("xyxxyzyzyxyxxyziyzy"));
    }

    public static String longest(String str) {
        String s = str.charAt(0) + "";
        String max = "";
        int i = 1;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (!s.contains(c + "")) {
                s += str.charAt(i);
            } else {
                if (s.length() > max.length()) {
                    max = s;
                }
                if (c == str.charAt(i - 1)) {
                    s = c + "";
                } else {
                    int j = str.substring(0, i).lastIndexOf(s);
                    //j = j < i ? j : str.indexOf(s);
                    j = str.indexOf(c, j);
                    i = j + 1;
                    s = str.charAt(i) + "";
                }
            }
            i++;
        }
        return s.length() > max.length() ? s : max;
    }
}