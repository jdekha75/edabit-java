package org.jdekha;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class LeastCommonMultTest {

    @Test
    public void test01() {
        Instant i = Instant.now();
        System.out.println(i);
        assertEquals(2520, LeastCommonMult.lcmOfArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(Instant.now());
        System.out.println(Instant.now().toEpochMilli() - i.toEpochMilli());
    }

    @Test
    public void test02() {
        assertEquals(27965340, LeastCommonMult.lcmOfArray(new int[]{13, 6, 17, 18, 19, 20, 37}));
    }

    @Test
    public void test03() {
        assertEquals(2333760, LeastCommonMult.lcmOfArray(new int[]{44, 64, 12, 17, 65}));
    }

    @Test
    public void test04() {
        assertEquals(2692800, LeastCommonMult.lcmOfArray(new int[]{200, 30, 18, 11, 8, 64, 34}));
    }

    @Test
    public void test05() {
        Instant i = Instant.now();
        System.out.println(i);
        assertEquals(2744820, LeastCommonMult.lcmOfArray(new int[]{5, 4, 6, 46, 54, 12, 13, 17}));
        System.out.println(Instant.now());
        System.out.println(Instant.now().toEpochMilli() - i.toEpochMilli());
    }

    @Test
    public void test06() {
        Instant i = Instant.now();
        System.out.println(i);
        assertEquals(78712992, LeastCommonMult.lcmOfArray(new int[]{46, 54, 466, 544}));
        System.out.println(Instant.now());
        System.out.println(Instant.now().toEpochMilli() - i.toEpochMilli());
    }

// credit goes to the original author/publisher @Raka Raka

}