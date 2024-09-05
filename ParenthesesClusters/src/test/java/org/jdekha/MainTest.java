package org.jdekha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author edwardclark
 **/

class MainTest {

        @Test
        public void test1() {
            assertArrayEquals(Main.split("()()()"), new String[]{"()", "()", "()"});
        }

        @Test
        public void test2() {
            assertArrayEquals(Main.split(""), new String[]{});
        }

        @Test
        public void test3() {
            assertArrayEquals(Main.split("()()(())"), new String[]{"()", "()", "(())"});
        }

        @Test
        public void test4() {
            assertArrayEquals(Main.split("(())(())"), new String[]{"(())", "(())"});
        }

        @Test
        public void test5() {
            assertArrayEquals(Main.split("((()))"), new String[]{"((()))"});
        }

        @Test
        public void test6() {
            assertArrayEquals(Main.split("()(((((((((())))))))))"), new String[]{"()", "(((((((((())))))))))"});
        }

        @Test
        public void test7() {
            assertArrayEquals(Main.split("((())()(()))(()(())())(()())"), new String[]{"((())()(()))", "(()(())())", "(()())"});
        }

        @Test
        public void test8() {
            assertArrayEquals(Main.split("((()))(())()()(()())"), new String[]{"((()))", "(())", "()", "()", "(()())"});
        }

        @Test
        public void test9() {
            assertArrayEquals(Main.split("((())())(()(()()))"), new String[]{"((())())", "(()(()()))"});
        }

        @Test
        public void test10() {
            assertArrayEquals(Main.split("(()(()()))()(((()))()(()))(()((()))(())())"), new String[]{"(()(()()))", "()", "(((()))()(()))", "(()((()))(())())"});
        }
    }

