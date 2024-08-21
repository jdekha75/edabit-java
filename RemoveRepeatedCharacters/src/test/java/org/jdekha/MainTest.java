package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test01() {
        assertEquals("helo", Main.unrepeated("hello"));
    }

    @Test
    public void test02() {
        assertEquals("WE!", Main.unrepeated("WWEE!!!"));
    }

    @Test
    public void test03() {
        assertEquals("cal 91", Main.unrepeated("call 911"));
    }

    @Test
    public void test04() {
        assertEquals("a", Main.unrepeated("aaaaaa"));
    }

    @Test
    public void test05() {
        assertEquals("alwf tes", Main.unrepeated("alwaff test"));
    }

    @Test
    public void test06() {
        assertEquals("tesha", Main.unrepeated("teshahset"));
    }

    @Test
    public void test07() {
        assertEquals("porcuine", Main.unrepeated("porcupine"));
    }

    @Test
    public void test08() {
        assertEquals("alter go", Main.unrepeated("alter ego"));
    }

    @Test
    public void test09() {
        assertEquals("rejuvnat", Main.unrepeated("rejuvenate"));
    }

    @Test
    public void test10() {
        assertEquals("strau nimb", Main.unrepeated("stratus nimbus"));
    }

    @Test
    public void test11() {
        assertEquals("strageiz", Main.unrepeated("stragegize"));
    }

}