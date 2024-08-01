package org.jdekha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

        String word = "spring";
        String nest = "sprspspspringringringg";

        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(nest);

        System.out.println(validWordNest(word, nest));
        word = "incredible";
        nest = "increinincrincredibleediblecredibledible";
        System.out.println(validWordNest(word, nest));
    }

    public static boolean validWordNest(String word, String nest) {


        Pattern p = Pattern.compile(word);
        Matcher m = p.matcher(nest);
        while (m.find(0) && !word.equals(nest)) {

            int start = m.start();
            int end = m.end();
            System.out.println(nest);
            nest = nest.substring(0, start).concat(nest.substring(end));
            p = Pattern.compile(word);
            m = p.matcher(nest);
            System.out.println(nest);
        }

        System.out.println("le dernier " + nest);
        return word.equals(nest);
    }

}