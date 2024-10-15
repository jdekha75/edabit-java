package org.jdekha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url = "https://www.youtube.com/watch?t=12&v=XPE_r1cArWRg&u=n"; //group(3)
        System.out.println(youtubeId(url));
        url = "https://www.youtube.com/XPEr1cAr_WRg"; //group(5)
        System.out.println(youtubeId(url));
    }

    public static String youtubeId(String url) {


        //String url = "https://www.youtube.com/watch?t=12&v=XPE_r1cArWRg&u=n"; //group(3)
        //url = "https://www.youtube.com/XPEr1cAr_WRg"; //group(5)
        String reg1 = "v=([\\w-]+)(&.+)?";
        String reg2 = "/([\\w-]+)";

        Pattern p = Pattern.compile("(.*)(" + reg1 + "|" + reg2 + ")");
        Matcher m = p.matcher(url);
        m.matches();
//        System.out.println(m.find());
//        System.out.println(m.group(0));
//        System.out.println(m.group(1));
//        System.out.println(m.group(2));
//        System.out.println(m.group(3));
//        System.out.println(m.group(4));
//        System.out.println(m.group(5));
        String s = m.group(2);
        s = s.startsWith("/") ? s.substring(1) : m.group(3);
        return s;
//        //String s = m.group()
//

//        System.out.println(url.matches(".+(v=.+[^&]?)"));
//        System.out.println(url.substring(url.lastIndexOf("v=") + 2));
//        System.out.println(url.matches(".+/(.+)"));
//        System.out.println(url.substring(url.lastIndexOf('/') + 1));
    }
}