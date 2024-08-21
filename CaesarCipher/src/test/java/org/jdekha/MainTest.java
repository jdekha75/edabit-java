package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        assertEquals("okffng-Qwvb", Main.caesarCipher("middle-Outz",2));
    }

    @Test
    public void test2() {
        assertEquals("Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj", Main.caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5));
    }

    @Test
    public void test3() {
        assertEquals("U zlcyhx ch hyyx cm u zlcyhx chxyyx", Main.caesarCipher("A friend in need is a friend indeed", 20));
    }

    @Test
    public void test4() {
        assertEquals("B Gppm boe Ijt Npofz Bsf Tppo Qbsufe.", Main.caesarCipher("A Fool and His Money Are Soon Parted.", 27));
    }

    @Test
    public void test5() {
        assertEquals("Lkb pelria klq tloov lsbo qefkdp qexq exsb xiobxav exmmbkba xka qexq zxkklq yb zexkdba.", Main.caesarCipher("One should not worry over things that have already happened and that cannot be changed.", 49));
    }

    @Test
    public void test6() {
        assertEquals("Xwyg pk Omqwna Kja eo w lklqhwn owuejc pdwp iawjo w lanokj dwo pk opwnp kran, oeiehwn pk: xwyg pk pda znwsejc xkwnz.", Main.caesarCipher("Back to Square One is a popular saying that means a person has to start over, similar to: back to the drawing board.", 126));
    }

}