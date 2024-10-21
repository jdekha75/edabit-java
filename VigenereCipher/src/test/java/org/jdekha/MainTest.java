package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    final String t1 = "Soylent Green is people.";
    final String t2 = "SOYLENTGREENISPEOPLE";
    final String t3 = "Darth Vader is Luke's father.";
    final String t4 = "TYLERDURDENWASHIMALLALONG";
    final String t5 = "Malcolm Crowe was dead the whole time.";
    final String t6 = "THEYWERETHEGHOSTSHAUNTINGTHEIROWNHOUSE";

    @Test
    public void test1() {
        assertEquals("KDMTPRKYGSMYMJHTCXWI", Main.vigenere(t1, "spoiler"));
    }

    @Test
    public void test2() {
        assertEquals(t2, Main.vigenere("HMRSSAIEKLSAXQILCCAC", "python"));
    }

    @Test
    public void test3() {
        assertEquals("VPFBSZRVTFQDPLCTGNLXYWG", Main.vigenere(t3, "spoiler"));
    }

    @Test
    public void test4() {
        assertEquals(t4, Main.vigenere("LNZMCVJFLPFLOASABOTWSACVR", "spoil"));
    }

    @Test
    public void test5() {
        assertEquals("QDLDWEQFRPEXADSEMTHWHFEASOEUQFI", Main.vigenere(t5, "edabit"));
    }

    @Test
    public void test6() {
        assertEquals(t6, Main.vigenere("FVZGAWDSOPIYTCNBWZMIIBMFSHCMMJAKIPSMES", "movies"));
    }
}