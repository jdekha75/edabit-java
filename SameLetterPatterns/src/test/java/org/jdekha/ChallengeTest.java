package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {

    @Test
    public void test1() {
        assertTrue(Challenge.sameLetterPattern("ABAB", "CDCD"));
    }

    @Test
    public void test2() {
        assertTrue(Challenge.sameLetterPattern("AAABBB", "CCCDDD"));
    }

    @Test
    public void test3() {
        assertTrue(Challenge.sameLetterPattern("ABCBA", "BCDCB"));
    }

    @Test
    public void test4() {
        assertTrue(Challenge.sameLetterPattern("AAAA", "BBBB"));
    }

    @Test
    public void test5() {
        assertTrue(Challenge.sameLetterPattern("BAAB", "ABBA"));
    }

    @Test
    public void test6() {
        assertTrue(Challenge.sameLetterPattern("BAAB", "QZZQ"));
    }

    @Test
    public void test7() {
        assertTrue(Challenge.sameLetterPattern("TTZZVV", "PPSSBB"));
    }

    @Test
    public void test8() {
        assertTrue(Challenge.sameLetterPattern("ZYX", "ABC"));
    }

    @Test
    public void test9() {
        assertTrue(Challenge.sameLetterPattern("AABAA", "SSCSS"));
    }

    @Test
    public void test10() {
        assertTrue(Challenge.sameLetterPattern("AABAABAA", "SSCSSCSS"));
    }

    @Test
    public void test11() {
        assertTrue(Challenge.sameLetterPattern("UBUBUBUB", "WEWEWEWE"));
    }

    @Test
    public void test12() {
        assertFalse(Challenge.sameLetterPattern("FFGG", "FFG"));
    }

    @Test
    public void test13() {
        assertFalse(Challenge.sameLetterPattern("FFGG", "CDCD"));
    }

    @Test
    public void test14() {
        assertFalse(Challenge.sameLetterPattern("FFFG", "GGHI"));
    }

    @Test
    public void test15() {
        assertFalse(Challenge.sameLetterPattern("FFFF", "ABCD"));
    }

    @Test
    public void test16() {
        assertFalse(Challenge.sameLetterPattern("ABCA", "ABCD"));
    }

    @Test
    public void test17() {
        assertFalse(Challenge.sameLetterPattern("ABCAAA", "DDABCD"));
    }

}