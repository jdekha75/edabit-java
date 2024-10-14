package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test01() {
        assertEquals("19s", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Oscar"));
    }

    @Test
    public void test02() {
        assertEquals("21u", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Lucas"));
    }

    @Test
    public void test03() {
        assertEquals("18r", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Marko"));
    }

    @Test
    public void test04() {
        assertEquals("25y", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Esley"));
    }

    @Test
    public void test05() {
        assertEquals("18r", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Rogei"));
    }

    @Test
    public void test06() {
        assertEquals("19s", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Nicolas"));
    }

    @Test
    public void test07() {
        assertEquals("22v", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Flavio"));
    }

    @Test
    public void test08() {
        assertEquals("25y", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Andrey"));
    }

    @Test
    public void test09() {
        assertEquals("15o", Main.alphabetIndex(new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"}, "Hello"));
    }


}