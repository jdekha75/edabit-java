package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        assertEquals("zyxwvutsrqponmlkjihgfedcba", Main.atbash("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        assertEquals("ZYXWVUTSRQPONMLKJIHGFEDCBA", Main.atbash("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void test3() {
        assertEquals("Gsv dliw 'zgyzhs' wvirevh uiln gsv gsv urihg zmw ozhg 2 ovggvih lu gsv Svyivd zokszyvg.", Main.atbash("The word 'atbash' derives from the the first and last 2 letters of the Hebrew alphabet."));
    }

    @Test
    public void test4() {
        assertEquals("Encryption and decryption are identical for the Atbash cipher.", Main.atbash("Vmxibkgrlm zmw wvxibkgrlm ziv rwvmgrxzo uli gsv Zgyzhs xrksvi."));
    }

}