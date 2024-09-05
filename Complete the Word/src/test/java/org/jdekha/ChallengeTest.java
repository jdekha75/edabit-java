package org.jdekha;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

        @Test
        public void test1() {
            assertTrue(Main.canComplete("butl", "beautiful"));
        }

        @Test
        public void test2() {
            System.out.println("\"z\" does not exist in the word `beautiful`");
            assertFalse(Main.canComplete("butlz", "beautiful"));
        }

        @Test
        public void test3() {
            System.out.println("although \"t\", \"u\", \"l\" and \"b\" incorrectly ordered");
            assertFalse(Main.canComplete("tulb", "beautiful"));
        }

        @Test
        public void test4() {
            System.out.println("too many \"b's\", beautiful has only 1");
            assertFalse(Main.canComplete("bbutl", "beautiful"));
        }

        @Test
        public void test5() {
            assertTrue(Main.canComplete("sg", "something"));
        }

        @Test
        public void test6() {
            System.out.println("out of order");
            assertFalse(Main.canComplete("sgi", "something"));
        }

        @Test
        public void test7() {
            assertTrue(Main.canComplete("sing", "something"));
        }

        @Test
        public void test8() {
            System.out.println("too many i's");
            assertFalse(Main.canComplete("siing", "something"));
        }

}