package org.jdekha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(isZygodrome(1));
        //System.out.println(isZygodrome(121122));

    }

    public static boolean isZygodrome(long num) {

        int i = 0;
        long r = num % 10;
        long q = num / 10;
        while (i >= 0 && q != 0) {
            long r2 = q % 10;
            if (r == r2) {
                i++;
                r = r2;
                q /= 10;
            } else if (i > 0) {
                i = 0;
                r = r2;
                q /= 10;
            } else
                i--;
        }
        return i > 0;
    }
}