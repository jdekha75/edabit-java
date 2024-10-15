package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void test1() {
        assertEquals("XPEr1cArWRg", Main.youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg"));
    }

    @Test
    public void test2() {
        assertEquals("-SNQGyVW_YI", Main.youtubeId("http://www.youtube.com/watch?v=-SNQGyVW_YI&t=8871"));
    }

    @Test
    public void test3() {
        assertEquals("vxP3bY-XxY4", Main.youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4"));
    }

    @Test
    public void test4() {
        assertEquals("yv56ncTdTmU", Main.youtubeId("www.youtube.com/watch?list=PL3QZUm48uWnsdFakp3A2fI-NzmfH1jyQe&v=yv56ncTdTmU&index=8"));
    }

    @Test
    public void test5() {
        assertEquals("BCDEDi5gDPo", Main.youtubeId("https://youtu.be/BCDEDi5gDPo"));
    }

    @Test
    public void test6() {
        assertEquals("jOxnoDi9IYg", Main.youtubeId("https://www.youtube.com/watch?feature=youtu.be&v=jOxnoDi9IYg&t=3311s"));
    }

    @Test
    public void test7() {
        assertEquals("2w9SQjdn9U4", Main.youtubeId("https://www.youtube-nocookie.com/embed/2w9SQjdn9U4"));
    }

    @Test
    void test8() {
        assertEquals("abcdef", Main.youtubeId("youtube.com/abcdef"));
    }

    @Test
    void test9() {
        assertEquals("abcdef", Main.youtubeId("youtube.com/watch?v=abcdef"));
    }

    @Test
    void test10() {
        assertEquals("XPE_r1cArWRg", Main.youtubeId("https://www.youtube.com/watch?t=12&v=XPE_r1cArWRg&u=n"));
    }

    @Test
    void test11() {
        assertEquals("XPE_r1cArWRg", Main.youtubeId("https://www.youtube.com/watch?v=XPE_r1cArWRg"));
    }
}