package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private String[] strVector = new String[] {"rascal", "racecar", "madam", "adieu", "radar", "rotor", "abacus", "rotator", "scholars"};
    private boolean[] resVector = new boolean[] {false, true, true, false, true, true, false, true, false};

    @Test
    public void test01() {
        assertEquals(Main.isPalindrome(strVector[0]), resVector[0]);
    }

    @Test
    public void test02() {
        assertEquals(Main.isPalindrome(strVector[1]), resVector[1]);
    }

    @Test
    public void test03() {
        assertEquals(Main.isPalindrome(strVector[2]), resVector[2]);
    }

    @Test
    public void test04() {
        assertEquals(Main.isPalindrome(strVector[3]), resVector[3]);
    }

    @Test
    public void test05() {
        assertEquals(Main.isPalindrome(strVector[4]), resVector[4]);
    }

    @Test
    public void test06() {
        assertEquals(Main.isPalindrome(strVector[5]), resVector[5]);
    }

    @Test
    public void test07() {
        assertEquals(Main.isPalindrome(strVector[6]), resVector[6]);
    }

    @Test
    public void test08() {
        assertEquals(Main.isPalindrome(strVector[7]), resVector[7]);
    }

    @Test
    public void test09() {
        assertEquals(Main.isPalindrome(strVector[8]), resVector[8]);
    }

}