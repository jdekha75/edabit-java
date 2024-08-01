package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChallengeTest {

    @Test
    public void test1() {
        assertEquals(false, Challenge.validWordNest("redeem", "rederedredrredredrerrrederedeememedeemedeemedeeemeemmedeemeemeemem"));
    }

    @Test
    public void test2() {
        assertEquals(true, Challenge.validWordNest("survey", "sursursurvsurvssurssursusurveyrveyveyurveyveyurveyeyeyveyvey"));
    }

    @Test
    public void test3() {
        assertEquals(false, Challenge.validWordNest("sensation", "sensatissenssensastssenensensasenssensensensationsationsationationtionsationatioionantionensationon"));
    }

    @Test
    public void test4() {
        assertEquals(false, Challenge.validWordNest("feed", "feefeeded"));
    }

    @Test
    public void test5() {
        assertEquals(true, Challenge.validWordNest("station", "ststatstasstatistationontationtionionation"));
    }

    @Test
    public void test6() {
        assertEquals(false, Challenge.validWordNest("quarrel", "quaquarrquarrelrerell"));
    }

    @Test
    public void test7() {
        assertEquals(false, Challenge.validWordNest("broadcast", "broadcbroadcastbroadcastast"));
    }

    @Test
    public void test8() {
        assertEquals(true, Challenge.validWordNest("current", "currccurrcurcurrcucucurrentrrentrrententrententurrentent"));
    }

    @Test
    public void test9() {
        assertEquals(true, Challenge.validWordNest("diet", "diet"));
    }

    @Test
    public void test10() {
        assertEquals(false, Challenge.validWordNest("park", "pppappappapapapapparkarkarkrkrkrkrkkarkrkrarkark"));
    }

    @Test
    public void test11() {
        assertEquals(true, Challenge.validWordNest("undermine", "undermiundermundermiunununderundermineminederminedermineneinene"));
    }

    @Test
    public void test12() {
        assertEquals(false, Challenge.validWordNest("nail", "nannnailnailailil"));
    }

    @Test
    public void test13() {
        assertEquals(true, Challenge.validWordNest("show", "sshssshowhowhowowhow"));
    }

    @Test
    public void test14() {
        assertEquals(false, Challenge.validWordNest("demand", "dedemdeamademademandndndmandnd"));
    }

    @Test
    public void test15() {
        assertEquals(true, Challenge.validWordNest("publicity", "publicppublicityublicityity"));
    }

    @Test
    public void test16() {
        assertEquals(false, Challenge.validWordNest("relief", "rrerelirerreerrereliefliefelielifliefliefefliefelfeief"));
    }

    @Test
    public void test17() {
        assertEquals(true, Challenge.validWordNest("pipe", "ppppppipeipeipeipeipeipe"));
    }

    @Test
    public void test18() {
        assertEquals(false, Challenge.validWordNest("diagram", "diargdiadidiadiagramgramagramgramam"));
    }

    @Test
    public void test19() {
        assertEquals(true, Challenge.validWordNest("salt", "ssaltalt"));
    }

    @Test
    public void test20() {
        assertEquals(true, Challenge.validWordNest("pioneer", "pionpippipioppionpiopipioneeroneerneereerioneerneeroneerioneeroneereer"));
    }
}

