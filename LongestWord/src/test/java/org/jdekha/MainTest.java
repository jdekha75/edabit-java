package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    /**
     ======================================= 
     TestGen 3.1 for JUnit 4.13.0 		
     Test Case: Main::findLongest 
     Timestamp: 10/18/2020 04:17:33 PM
     --------------------------------------- 
     ® DARKKO 2020 © 
     ======================================= 

     **/ 


        @Test
        public void test1() {
            assertEquals("perpetually", Main.findLongest("I will and ever will be gratefully and perpetually loving you Tesh!😘"));
        }

        @Test
        public void test2() {
            assertEquals("darkness", Main.findLongest("Hello darkness my old friend."));
        }

        @Test
        public void test3() {
            assertEquals("yourself", Main.findLongest("Yourself is your soul's captain and fate's master."));
        }

        @Test
        public void test4() {
            assertEquals("daughter", Main.findLongest("The pretty daughter's toy, a doll, is as pretty as her."));
        }

        @Test
        public void test5() {
            assertEquals("forever", Main.findLongest("A thing of beauty is a joy forever."));
        }

        @Test
        public void test6() {
            assertEquals("forgetfulness", Main.findLongest("Forgetfulness is by all means powerless!"));
        }

        @Test
        public void test7() {
            assertEquals("strengths", Main.findLongest("\"Strengths\" is the longest and most commonly used word that contains only a single vowel."));
        }

    
// end of tests

}