package org.jdekha;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome("ababa"));
    }

    public static boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    // Recursive solution here
    public static boolean isPalindromeRecursive(String str) {
        boolean isPal = str.charAt(0) == str.charAt(str.length() - 1) ;
        if (!isPal) return false;
        if (str.length() == 1) return true;
        str = str.substring(1, str.length()-1);
        return isPalindromeRecursive(str);
    }
}