package org.jdekha;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello world!");
        File r = new File("/home/linux/Documents");
        File f = new File("android.txt");
        System.out.println(r.getName());
        System.out.println(f.getName());
        System.out.println(findFiles(r, f));
    }

    public static boolean findFile(File repertoire, File fichier) {
        boolean trouve = false;
        File[] rep = repertoire.listFiles();
        assert rep != null;
        for (int i = 0; i < rep.length && !trouve; i++) {
            File f = rep[i];
            //System.out.println(f.getName());
            if (f.isDirectory()) {
                trouve = findFile(f, fichier);
            }
            //System.out.println(f.getAbsoluteFile());
            if (f.getName().equals(fichier.getName())) {
                trouve = true;
                System.out.println(f.getAbsoluteFile());
            }
        }
        return trouve;
    }

    public static List<String> findFiles(File repertoire, File fichier) {
        List<String> files = new ArrayList<>();
        File[] rep = repertoire.listFiles();
        assert rep != null;
        for (File f : rep) {
            //System.out.println(f.getName());
            if (f.isDirectory()) {
             files.addAll(findFiles(f, fichier));
            }
            //System.out.println(f.getAbsoluteFile());
            if (f.getName().equals(fichier.getName())) {
                File absoluteFile = f.getAbsoluteFile();
                files.add(absoluteFile.toString());
                System.out.println(absoluteFile);
            }
        }
        return files;
    }
}