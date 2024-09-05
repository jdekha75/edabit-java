package org.jdekha;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //"I will and ever will be gratefully and perpetually loving you Tesh!😘"
        System.out.println(findLongest("I will and ever will be gratefully and perpetually loving you Tesh!"));
    }

    public static String findLongest(String sentence) {
        System.out.println(sentence.indexOf(' '));
        String longest = " "; //sentence.substring(0, sentence.indexOf(' '));
        if (sentence.contains(" ")) {
            sentence = sentence.substring(sentence.indexOf(' ') + 1);
            String find = findLongest(sentence);
            System.out.println(find);
            longest = longest.length() > find.length() ? longest : find;
        }
        return longest;
    }
}