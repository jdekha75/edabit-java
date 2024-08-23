package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test01() {
        assertEquals(1, Main.incDec(0));
    }

    @Test
    public void test02() {
        assertEquals(10, Main.incDec(1));
    }

    @Test
    public void test03() {
        assertEquals(100, Main.incDec(2));
    }

    @Test
    public void test04() {
        assertEquals(475, Main.incDec(3));
    }

    @Test
    public void test05() {
        assertEquals(1675, Main.incDec(4));
    }

    @Test
    public void test06() {
        assertEquals(4954, Main.incDec(5));
    }

    @Test
    public void test07() {
        assertEquals(12952, Main.incDec(6));
    }
// credit goes to the original author/publisher @Mubashir Hassan

}