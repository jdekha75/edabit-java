package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test01() {
        assertEquals("5 + 4/10 + 4/100", Main.expandedForm(5.44));
    }

    @Test
    public void test02() {
        assertEquals("40 + 6 + 6/10 + 6/100", Main.expandedForm(46.66));
    }

    @Test
    public void test03() {
        assertEquals("80 + 7 + 4/100", Main.expandedForm(87.04));
    }

    @Test
    public void test04() {
        assertEquals("100 + 20 + 3 + 2/100 + 5/1000", Main.expandedForm(123.025));
    }

    @Test
    public void test05() {
        assertEquals("50 + 2/10 + 7/100", Main.expandedForm(50.27));
    }

    @Test
    public void test06() {
        assertEquals("200 + 7 + 3/10 + 3/100 + 3/1000", Main.expandedForm(207.333));
    }

    @Test
    public void test07() {
        System.out.println(Main.expandedForm(0.57));
        assertEquals("5/10 + 7/100", Main.expandedForm(0.57));
    }

    @Test
    public void test08() {
        assertEquals("100 + 40 + 2/100 + 3/1000", Main.expandedForm(140.023));
    }

    @Test
    public void test09() {
        assertEquals("90 + 9/10 + 9/100", Main.expandedForm(90.99));
    }

    @Test
    public void test10() {
        assertEquals("80 + 4 + 5/10", Main.expandedForm(84.5));
    }

    @Test
    public void test11() {
        assertEquals("70 + 6 + 2/100", Main.expandedForm(76.02));
    }

    @Test
    public void test12() {
        assertEquals("40 + 4 + 5/10", Main.expandedForm(44.5));
    }

    @Test
    public void test13() {
        assertEquals("30 + 7 + 4/10 + 9/100", Main.expandedForm(37.49));
    }

    @Test
    public void test14() {
        assertEquals("60 + 7/10000", Main.expandedForm(60.0007));
    }

    @Test
    public void test15() {
        assertEquals("20 + 9 + 2/10 + 2/100", Main.expandedForm(29.22));
    }

    @Test
    public void test16() {
        assertEquals("10 + 9/10 + 9/100", Main.expandedForm(10.99));
    }

    @Test
    public void test17() {
        assertEquals("60 + 3 + 9/100", Main.expandedForm(63.09));
    }

    @Test
    public void test18() {
        assertEquals("30 + 7 + 2/100 + 2/1000", Main.expandedForm(37.022));
    }

    @Test
    public void test19() {
        assertEquals("40 + 3 + 2/10 + 1/100", Main.expandedForm(43.21));
    }

    @Test
    public void test20() {
        assertEquals("300 + 9 + 2/100 + 8/1000", Main.expandedForm(309.028));
    }

    @Test
    public void test21() {
        assertEquals("400 + 40 + 7 + 3/10 + 3/100", Main.expandedForm(447.33));
    }

    @Test
    public void test22() {
        assertEquals("60 + 5 + 5/100", Main.expandedForm(65.05));
    }

    @Test
    public void test23() {
        assertEquals("40 + 7 + 3/10 + 4/100", Main.expandedForm(47.34));
    }

    @Test
    public void test24() {
        assertEquals("60 + 8 + 6/10 + 9/100 + 9/1000", Main.expandedForm(68.699));
    }

    @Test
    public void test25() {
        assertEquals("1 + 2/10 + 4/100", Main.expandedForm(1.24));
    }

    @Test
    public void test26() {
        assertEquals("4 + 2/10 + 8/100", Main.expandedForm(4.28));
    }

    @Test
    public void test27() {
        assertEquals("7 + 3/10 + 4/1000", Main.expandedForm(7.304));
    }

    @Test
    public void test28() {
        assertEquals("4/100", Main.expandedForm(0.04));
    }

    @Test
    public void test29() {
        assertEquals("1/10 + 2/100 + 3/1000 + 4/10000", Main.expandedForm(0.1234));
    }

}