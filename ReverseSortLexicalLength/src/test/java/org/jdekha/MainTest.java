package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test01() {
        assertEquals("pragmatic making! You've rocked world the the in", Main.reverseSort("You've rocked the pragmatic world in the making!"));
    }

    @Test
    public void test02() {
        assertEquals("enjoying living worth world makes Tesh for. and my", Main.reverseSort("Tesh makes my world worth enjoying and living for."));
    }

    @Test
    public void test03() {
        assertEquals("Shaken bloody truth lies. crazy the and by", Main.reverseSort("Shaken by the bloody truth and crazy lies."));
    }

    @Test
    public void test04() {
        assertEquals("collections streams program with! Java fun are and to", Main.reverseSort("Java streams and collections are fun to program with!"));
    }

    @Test
    public void test05() {
        assertEquals("substance beauty. woman Tesha true and of is a a", Main.reverseSort("Tesha is a woman of true substance and a beauty."));
    }

    @Test
    public void test06() {
        assertEquals("alphanumeric sorting. similar Lexical sort to is", Main.reverseSort("Lexical sort is similar to alphanumeric sorting."));
    }

    @Test
    public void test07() {
        assertEquals("you. not do, all up To to to or is do", Main.reverseSort("To do or not to do, is all up to you."));
    }

    @Test
    public void test08() {
        assertEquals("Javascript program methods with! array fun are to", Main.reverseSort("Javascript array methods are fun to program with!"));
    }

    @Test
    public void test09() {
        assertEquals("Programming Java fun. lot of is in a", Main.reverseSort("Programming in Java is a lot of fun."));
    }

    @Test
    public void test10() {
        assertEquals("Truly, Tesh. heart beats that one for for but no a", Main.reverseSort("Truly, a heart that beats for no one but for Tesh."));
    }

}