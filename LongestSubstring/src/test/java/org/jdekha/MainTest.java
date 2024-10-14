package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        assertEquals("abc", Main.longest("abcabcbb"));
    }

    @Test
    public void test2() {
        assertEquals("a", Main.longest("aaaaaa"));
    }

    @Test
    public void test3() {
        assertEquals("abcde", Main.longest("abcde"));
    }

    @Test
    public void test4() {
        assertEquals("abcd", Main.longest("abcda"));
    }

    @Test
    public void test5() {
        assertEquals("ac", Main.longest("aaccddeeffb"));
    }

    @Test
    public void test6() {
        assertEquals("abd", Main.longest("abdde"));
    }

    @Test
    public void test7() {
        assertEquals("cd", Main.longest("ccdddcccc"));
    }

    @Test
    public void test8() {
        assertEquals("cdx", Main.longest("cdxdxccxc"));
    }

    @Test
    public void test9() {
        assertEquals("defgh", Main.longest("abddefgh"));
    }

    @Test
    public void test10() {
        assertEquals("abcd", Main.longest("abcdabcd"));
    }

    @Test
    public void test11() {
        assertEquals("debc", Main.longest("abddebcc"));
    }

    @Test
    public void test12() {
        assertEquals("xyz", Main.longest("xyxxyzyzy"));
    }

    @Test
    public void test13() {
        assertEquals("lmjsde", Main.longest("kjlmjsdeee"));
    }

    @Test
    public void test14() {
        assertEquals("lmjsdfew", Main.longest("kjlmjsdfew"));
    }

    @Test
    public void test15() {
        assertEquals("lmjsdfewi", Main.longest("kjlmjsdfewii"));
    }

    @Test
    public void test16() {
        assertEquals("idfew", Main.longest("kjlmjjiiiidfewii"));
    }

    @Test
    public void test17() {
        assertEquals("kjlm", Main.longest("kjlmjjiiiidfiwii"));
    }
}