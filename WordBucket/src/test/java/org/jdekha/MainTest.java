package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        assertArrayEquals(Main.bucketize("she sells sea shells by the sea", 2), new String[]{});
    }

    @Test
    public void test2() {
        //test original tableau attendu avec une taille 0
        //assertArrayEquals(Main.bucketize("ab bc cd", 1), new String[]{});
        assertArrayEquals(Main.bucketize("ab bc cd", 1), new String[]{""});
    }

    @Test
    public void test3() {
        assertArrayEquals(Main.bucketize("she sells sea shells by the sea", 10), new String[]{"she sells", "sea shells", "by the sea"});
    }

    @Test
    public void test4() {
        assertArrayEquals(Main.bucketize("the mouse jumped over the cheese", 7), new String[]{"the", "mouse", "jumped", "over", "the", "cheese"});
    }

    @Test
    public void test5() {
        assertArrayEquals(Main.bucketize("fairy dust coated the air", 20), new String[]{"fairy dust coated", "the air"});
    }

    @Test
    public void test6() {
        assertArrayEquals(Main.bucketize("do the hokey pokey", 6), new String[]{"do the", "hokey", "pokey"});
    }

    @Test
    public void test7() {
        assertArrayEquals(Main.bucketize("do the hokey pokey", 12), new String[]{"do the hokey", "pokey"});
    }

    @Test
    public void test8() {
        assertArrayEquals(Main.bucketize("rich magnificent trees dotted the landscape", 12), new String[]{"rich", "magnificent", "trees dotted", "the", "landscape"});
    }

    @Test
    public void test9() {
        assertArrayEquals(Main.bucketize("rich magnificent trees dotted the landscape", 15), new String[]{"rich", "magnificent", "trees dotted", "the landscape"});
    }

    @Test
    public void test10() {
        assertArrayEquals(Main.bucketize("rich magnificent trees dotted the landscape", 18), new String[]{"rich magnificent", "trees dotted the", "landscape"});
    }

    @Test
    public void test11() {
        assertArrayEquals(Main.bucketize("rich magnificent trees dotted the landscape", 22), new String[]{"rich magnificent trees", "dotted the landscape"});
    }

    @Test
    public void test12() {
        assertArrayEquals(Main.bucketize("rich magnificent trees dotted the landscape", 40), new String[]{"rich magnificent trees dotted the", "landscape"});
    }

    @Test
    public void test13() {
        assertArrayEquals(Main.bucketize("rich magnificent trees dotted the landscape", 43), new String[]{"rich magnificent trees dotted the landscape"});
    }

    @Test
    public void test14() {
        assertArrayEquals(Main.bucketize("beep bo bee bop bee bo bo bop", 6), new String[]{"beep", "bo bee", "bop", "bee bo", "bo bop"});
    }

    @Test
    public void test15() {
        assertArrayEquals(Main.bucketize("beep bo bee bop bee bo bo bop", 10), new String[]{"beep bo", "bee bop", "bee bo bo", "bop"});
    }

    @Test
    public void test16() {
        assertArrayEquals(Main.bucketize("a b c d e", 3), new String[]{"a b", "c d", "e"});
    }

    @Test
    public void test17() {
        assertArrayEquals(Main.bucketize("a b c d e", 2), new String[]{"a", "b", "c", "d", "e"});
    }

    @Test
    public void test18() {
        assertArrayEquals(Main.bucketize("a b c d e", 1), new String[]{"a", "b", "c", "d", "e"});
    }

    @Test
    public void test19() {
        assertArrayEquals(Main.bucketize("a b c d e", 2), new String[]{"a", "b", "c", "d", "e"});
    }

    @Test
    public void test20() {
        assertArrayEquals(Main.bucketize("a b c d e", 1), new String[]{"a", "b", "c", "d", "e"});
    }

}