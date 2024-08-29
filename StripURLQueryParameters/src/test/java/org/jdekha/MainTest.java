package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    

        @Test
        public void test1() {
            assertEquals("https://edabit.com?a=2&b=2", Main.stripUrlParams("https://edabit.com?a=1&b=2&a=2", null));
        }

        @Test
        public void test2() {
            assertEquals("https://edabit.com?a=2", Main.stripUrlParams("https://edabit.com?a=1&b=2&a=2", new String[]{"b"}));
        }

        @Test
        public void test3() {
            assertEquals("https://edabit.com", Main.stripUrlParams("https://edabit.com", new String[]{"b"}));
        }

        @Test
        public void test4() {
            assertEquals("https://edabit.com?a=1&b=2", Main.stripUrlParams("https://edabit.com?a=1&b=2", null));
        }

        @Test
        public void test5() {
            assertEquals("https://edabit.com?a=1&b=2", Main.stripUrlParams("https://edabit.com?a=1&b=2", new String[]{"c"}));
        }

        @Test
        public void test6() {
            assertEquals("https://edabit.com?b=2&c=3", Main.stripUrlParams("https://edabit.com?a=1&b=2&c=3&d=4", new String[]{"a", "d"}));
        }

        @Test
        public void test7() {
            assertEquals("https://edabit.com?b=2&c=5", Main.stripUrlParams("https://edabit.com?a=1&b=2&c=3&d=4&c=5", new String[]{"a", "d"}));
        }
    }

