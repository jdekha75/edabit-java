package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private long[] numVector = new long[] {
            11, 222, 223, 1001, 1100, 11122, 3344466777L, 33444667778L,
            8866611229999L, 9977866655522L, 99999999, 0
    };
    private boolean[] resVector = new boolean[] {
            true, true, false, false, true, true, true, false, true,
            false, true, false
    };

    @Test
    public void test01() {
        assertEquals(Main.isZygodrome(numVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(Main.isZygodrome(numVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(Main.isZygodrome(numVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(Main.isZygodrome(numVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(Main.isZygodrome(numVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(Main.isZygodrome(numVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(Main.isZygodrome(numVector[6]), resVector[6]);
    }

    @Test
    public void test08() {
        assertEquals(Main.isZygodrome(numVector[7]), resVector[7]);
    }

    @Test
    public void test09() {
        assertEquals(Main.isZygodrome(numVector[8]), resVector[8]);
    }

    @Test
    public void test10() {
        assertEquals(Main.isZygodrome(numVector[9]), resVector[9]);
    }

    @Test
    public void test11() {
        assertEquals(Main.isZygodrome(numVector[10]), resVector[10]);
    }

    @Test
    public void test12() {
        assertEquals(Main.isZygodrome(numVector[11]), resVector[11]);
    }


}