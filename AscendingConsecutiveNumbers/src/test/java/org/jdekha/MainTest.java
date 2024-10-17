package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        assertTrue(Main.ascending("232425"));
    }

    @Test
    public void test2() {
        assertTrue(Main.ascending("444445"));
    }

    @Test
    public void test3() {
        assertTrue(Main.ascending("1234567"));
    }

    @Test
    public void test4() {
        assertTrue(Main.ascending("123412351236"));
    }

    @Test
    public void test5() {
        assertTrue(Main.ascending("57585960616263"));
    }

    @Test
    public void test6() {
        assertTrue(Main.ascending("500001500002500003"));
    }

    @Test
    public void test7() {
        assertTrue(Main.ascending("919920921"));
    }

    @Test
    public void test8() {
        assertFalse(Main.ascending("2324256"));
    }

    @Test
    public void test9() {
        assertFalse(Main.ascending("1235"));
    }

    @Test
    public void test10() {
        assertFalse(Main.ascending("121316"));
    }

    @Test
    public void test11() {
        assertFalse(Main.ascending("12131213"));
    }

    @Test
    public void test12() {
        assertFalse(Main.ascending("54321"));
    }

    @Test
    public void test13() {
        assertFalse(Main.ascending("56555453"));
    }

    @Test
    public void test14() {
        assertFalse(Main.ascending("90090190290"));
    }

    @Test
    public void test15() {
        assertFalse(Main.ascending("35236237238"));
    }
}