package org.jdekha;

import java.util.Arrays;

public class LeastCommonMult {
    public static void main(String[] args) {

        System.out.println(lcmOfArray(new int[]{1, 3, 5, 6}));//84
        System.out.println(lcmOfArray(new int[]{1, 2, 3, 4, 7}));//84
        System.out.println(lcmOfArray(new int[]{1, 3, 5, 7, 16})); //1680
        System.out.println(lcmOfArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));//  assertEquals 2520
        System.out.println(lcmOfArray(new int[]{13, 6, 17, 18, 19, 20, 37}));// assertEquals 27965340
        System.out.println(lcmOfArray(new int[]{46, 54, 466, 544}));
    }


    public static int lcmOfArray(int[] arr) {
        Arrays.sort(arr);
        int taille = arr.length;
        int max = arr[taille - 1];
        int start = 0;
        int i = 1;
        boolean trouve = false;
        while (!trouve) {
            trouve = true;
            start = max * i;
            for (int j = 0; j < taille && trouve; j++) {
                trouve = start % arr[j] == 0;
            }
            i++;
        }
        return start;
    }

/*

 */
    public static int lcmOfArray2(int[] arr) {
        Arrays.sort(arr);
        int taille = arr.length;
        int start = arr[0] * arr[1];
        boolean trouve = false;
        for (int i = 0; i < taille - 1 && !trouve; i++) {
            start = 1;
            for (int j = i + 1; j < taille && !trouve; j++) {
                start *= arr[i] * arr[j];
                trouve = true;
                for (int k = 0; k < taille && trouve; k++) {
                    trouve = trouve && (start % arr[k] == 0);
                }
            }
        }
        return start;
    }

    /*
    sur edabit
     */
    public static int lcmOfArray4(int[] n) {
        int lcm = n[0];
        for (int i = 1; i < n.length; i++) {
            lcm = lcm * n[i] / gcd(lcm, n[i]);
        }
        return lcm;
    }
/*

 */
    public static int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}