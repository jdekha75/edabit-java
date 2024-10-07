package org.jdekha;

import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddTwoStringNumbers {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

//        String z = "1".repeat(5);
//        System.out.println(z);
//        System.out.println(addStrNums("999", "1001"));
//        System.out.println(addStrNums("12300", "300021"));
        System.out.println(addStrNums("13300", "3367"));
    }

    public static String addStrNums(String n1, String n2) {
        int padding = Math.abs(n1.length() - n2.length());
        if (padding != 0) {
            String zeroPad = "0".repeat(padding);
            if (n1.length() < n2.length()) {
                n1 = zeroPad + n1;
            } else {
                n2 = zeroPad + n2;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] tab1 = new StringBuilder(n1).reverse().toString().toCharArray();
        char[] tab2 = new StringBuilder(n2).reverse().toString().toCharArray();
        int retenue = 0;
        for (int i = 0; i < tab1.length; i++) {
            int somme = ((int) tab1[i] + (int) tab2[i] + retenue) % 48;
            int unite = somme % 10;
            retenue = somme / 10;
            //System.out.println(tab2[i]);
            System.out.println(unite);
            stringBuilder.append(unite);
            //System.out.println(somme);
        }
        if (retenue == 1) {
            stringBuilder.append(retenue);
        }
        return stringBuilder.reverse().toString();
    }

    public static String addStrNums1(String n1, String n2) {

        int padding = Math.abs(n1.length() - n2.length());
        if (padding != 0) {
            String zeroPad = "0".repeat(padding);
            if (n1.length() < n2.length()) {
                n1 = zeroPad + n1;
            } else {
                n2 = zeroPad + n2;
            }
        }
        String s = "";
        int sum;
        int retenue = 0;
        int i = n1.length() - 1;
        StringBuilder sb = new StringBuilder(i + 1);
        while (i >= 0) {
            try {
                int i1 = Integer.parseInt(n1.charAt(i) + "");
                int i2 = Integer.parseInt(n2.charAt(i) + "");
                sum = i1 + i2 + retenue;
                retenue = sum / 10;
                sum = sum % 10;
                sb.append(sum);
                i--;
            } catch (NumberFormatException e) {
                return "-1";
            }
        }
        if (retenue > 0) {
            sb.append(retenue);
        }
        return n1 + " + " + n2 + " = " + sb.reverse().toString();
    }
}