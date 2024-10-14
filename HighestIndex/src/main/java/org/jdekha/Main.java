package org.jdekha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static String alphabetIndex(String[] alphabet, String s) {
        int i = alphabet.length - 1;
        s = s.toLowerCase();
        while (i > 0 && !s.contains(alphabet[i])) {
            i--;
        }
        s = i < 0 ? "" : i + 1 + alphabet[i];
        return s;
    }
}