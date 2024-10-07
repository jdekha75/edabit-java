package org.jdekha;

import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         *Petit programme comptant le nombre de miniscules, majiscules dans une chaine de caractère
         */
        String s = "u001.R6W8bhjC-2Bn7K1sGqIydk36XpVvVTeMh-2FA-2FGR9o1zxTrxdwVSrJ5Zkh10Ab0JAokLNYuhJihENzvTxu3oAF440tzBlmnu7tdlE-2FqUXmik9VNI6iVWWAr3TjLyDYG9eUJZ3aKs6HCUPTwMEtNl9JvvRZXhURUQZHTM-2FGZygGGZvVuB-2BCUw6oLLtgTojOm5bFFrnMRVhNGK3YvCGLwqdK4h41uiSC5eNAIZW4NkXZY0gHVdKOj-2FXcqSxWtkS3dKVvqEEwQjXWKNv7EoLYgsecX7n2EgGXSjVhR2Zr419dbyAlvxCYzCGFZgYMC1DNX5VXC0wDieCmL-2BvrBB8UCScjswT4gS9fgR2tsKaJrTZoyeSL9lX8E9HSXHlh5Ziz6b-2F4rQ7PM1CCvifDQcRf5MI-2FpDTjDl6-2B8w-2F0qs7OYO7VoJv4Y-3DIPJs_5hc-2FNUhuBrG2g3RAKA6BpiDwZYmB9Y2HxyOARAz3O4bae-2BWGIeFLYTt00fuqQm8qwoGVrPa6IYzUnB2-2BbKmnvA9Us9-2FaQcymqmHGxQwGI5W9HiZIN6-2FpkQLcFRqdg6acaH-2FqvwlBqvacThqQhUgQwZZQyERyxd-2FF6RTB94kdVmUVWRG-2BIlws97IigQuG8A1xc5GA-2BNmUF3VYZgIY-2FVL5YdXAq0mFxJFkisSXIucGMAo1-2F9rip7KHmF6CNZ-2B-2FG7qqBLFHbGUMYd-2BI5ILcTL2JkMztnh0iBGeHHza5b6Ah0iGJi5kaM31JhE3WtwqEah1go1k7lX-2Fg2tBnex8FbPqrd6hIsEGTbGBScp-2Bu9YFTzB0-3D";
        int min = 0;
        int maj = 0;

        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
                min++;
            }
            else if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
                maj++;
            }
        }
        System.out.println("length : " + s.length());
        System.out.println("min : " + min);
        System.out.println("maj : " + maj);
        System.out.println("rest : " + (s.length() - min - maj));
    }
}