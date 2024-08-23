package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1(){
        assertTrue(Main.isFactorial(2));
    }
    @Test
    public void test2(){
        assertFalse(Main.isFactorial(16));
    }
    @Test
    public void test3(){ assertTrue(Main.isFactorial(24)); }
    @Test
    public void test4(){
        assertFalse(Main.isFactorial(36));
    }
    @Test
    public void test5(){
        assertTrue(Main.isFactorial(120));
    }
    @Test
    public void test6(){
        assertFalse(Main.isFactorial(721));
    }

}