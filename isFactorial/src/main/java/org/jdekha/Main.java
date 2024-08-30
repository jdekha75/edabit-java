package org.jdekha;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isFactorial(int n){
        int d = 2;
        while(n % d == 0 && n > d){
            n = n / d;
            d++;
        }
        return n == d;
    }
}