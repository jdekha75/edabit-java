package org.jdekha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final char[][] vigenereTable = new char[26][26];

    static {
        for (int i = 0; i < 26; i++) {
            char c = (char) ('A' + i);
            for (int j = 0; j < 26; j++) {
                char c1 = (char) ((c + j - 'A') % 26 + 'A');
                vigenereTable[i][j] = c1;
                System.out.print(c1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println();
        System.out.println("Hello and welcome!");
        String message = "Soylent Green is people";
        String plaintext = "SPOILERSPOILERSPOILE";
        System.out.println(vigenere(message, plaintext));
    }

    public static String vigenere(String text, String keyword) {
        if (text.matches("\\w+")) {
            return fromCipher(text, keyword);
        }
        return toCipher(text, keyword);
    }

    private static String fromCipher(String cipher, String keyword) {
        char[] cipherArray = cipher.toCharArray();
        int length = cipherArray.length;
        keyword = keyword.toUpperCase();
        keyword = fill(keyword, length);
        char[] keywordArray = keyword.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index1 = 0;
            int index2 = keywordArray[i] - 'A';
            while (vigenereTable[index1][index2] != cipherArray[i]) {
                index1++;
            }
            char c = (char) (index1 + 'A');
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static String toCipher(String text, String keyword) {
        char[] textArray = text.replaceAll("\\W", "").toUpperCase().toCharArray();
        int length = textArray.length;
        keyword = keyword.toUpperCase();
        keyword = fill(keyword, length);
        char[] keywordArray = keyword.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index1 = textArray[i] - 'A';
            int index2 = keywordArray[i] - 'A';
            char c = vigenereTable[index1][index2];
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static String fill(String s, int taille) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < taille; i += length) {
            stringBuilder.append(s);
        }
        length = stringBuilder.length();
        if (length < taille) {
            length = taille - length;
            stringBuilder.append(s, 0, length);
        }
        return stringBuilder.toString();
    }
}