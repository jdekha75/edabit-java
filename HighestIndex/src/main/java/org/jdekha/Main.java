package org.jdekha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static String alphabetIndex(String[] alphabet, String s) {
        int i = alphabet.length - 1;
        while (!s.toLowerCase().contains(alphabet[i])) {
            i--;
        }
        return i + 1 + alphabet[i];
    }
}