package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    public void test1() {
        assertEquals(5, Main.kaprekar(1112));
    }

    @Test
    public void test2() {
        assertEquals(7, Main.kaprekar(456));
    }

    @Test
    public void test3() {
        assertEquals(3, Main.kaprekar(76));
    }

    @Test
    public void test4() {
        assertEquals(5, Main.kaprekar(100));
    }

    @Test
    public void test5() {
        assertEquals(4, Main.kaprekar(101));
    }

    @Test
    public void test6() {
        assertEquals(3, Main.kaprekar(5432));
    }

    @Test
    public void test7() {
        assertEquals(5, Main.kaprekar(1));
    }
}