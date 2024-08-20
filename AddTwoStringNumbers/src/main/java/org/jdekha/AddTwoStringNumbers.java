package org.jdekha;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddTwoStringNumbers {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        String z = "1".repeat(5);
        System.out.println(z);
        System.out.println(addStrNums("999", "1001"));
        System.out.println(addStrNums("12300", "300021"));
        System.out.println(addStrNums("189", "921"));
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
                //s = sum + s;
                sb.append(sum);
                i--;
            } catch (NumberFormatException e) {
                return "-1";
            }
        }
        if (retenue > 0) {
            //s = retenue + s;
            sb.append(retenue);
        }
        //System.out.println("sb " + sb.reverse().toString());
        return n1 + " + " + n2 + " = " + sb.reverse().toString();
        //return n1+ " + " + n2 + " = " + s;
    }
}