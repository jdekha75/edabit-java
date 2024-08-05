package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {

        @Test
        public void test1() {
            assertTrue(Challenge.canComplete("butl", "beautiful"));
        }

        @Test
        public void test2() {
            System.out.println("\"z\" does not exist in the word `beautiful`");
            assertFalse(Challenge.canComplete("butlz", "beautiful"));
        }

        @Test
        public void test3() {
            System.out.println("although \"t\", \"u\", \"l\" and \"b\" incorrectly ordered");
            assertFalse(Challenge.canComplete("tulb", "beautiful"));
        }

        @Test
        public void test4() {
            System.out.println("too many \"b's\", beautiful has only 1");
            assertFalse(Challenge.canComplete("bbutl", "beautiful"));
        }

        @Test
        public void test5() {
            assertTrue(Challenge.canComplete("sg", "something"));
        }

        @Test
        public void test6() {
            System.out.println("out of order");
            assertFalse(Challenge.canComplete("sgi", "something"));
        }

        @Test
        public void test7() {
            assertTrue(Challenge.canComplete("sing", "something"));
        }

        @Test
        public void test8() {
            System.out.println("too many i's");
            assertFalse(Challenge.canComplete("siing", "something"));
        }

}