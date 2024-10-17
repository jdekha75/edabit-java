package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        assertEquals("1/11", Main.fractions("0.(09)"));
    }

    @Test
    public void test2() {
        assertEquals("1/22", Main.fractions("0.0(45)"));
    }

    @Test
    public void test3() {
        assertEquals("10646/4995", Main.fractions("2.1(313)"));
    }

    @Test
    public void test4() {
        assertEquals("1/48", Main.fractions("0.0208(3)"));
    }

    @Test
    public void test5() {
        assertEquals("404111/33333", Main.fractions("12.(12345)"));
    }

    @Test
    public void test6() {
        assertEquals("57/56", Main.fractions("1.017(857142)"));
    }

    @Test
    public void test7() {
        assertEquals("1/19", Main.fractions("0.(052631578947368421)"));
    }
}