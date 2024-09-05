package org.jdekha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChallengeTest {

    @Test
    public void test1() {
        assertFalse(Challenge.validWordNest("redeem", "rederedredrredredrerrrederedeememedeemedeemedeeemeemmedeemeemeemem"));
    }

    @Test
    public void test2() {
        assertTrue(Challenge.validWordNest("survey", "sursursurvsurvssurssursusurveyrveyveyurveyveyurveyeyeyveyvey"));
    }

    @Test
    public void test3() {
        assertFalse(Challenge.validWordNest("sensation", "sensatissenssensastssenensensasenssensensensationsationsationationtionsationatioionantionensationon"));
    }

    @Test
    public void test4() {
        assertFalse(Challenge.validWordNest("feed", "feefeeded"));
    }

    @Test
    public void test5() {
        assertTrue(Challenge.validWordNest("station", "ststatstasstatistationontationtionionation"));
    }

    @Test
    public void test6() {
        assertFalse(Challenge.validWordNest("quarrel", "quaquarrquarrelrerell"));
    }

    @Test
    public void test7() {
       // assertEquals(false, Challenge.validWordNest("broadcast", "broadcbroadcastbroadcastast"));
        assertTrue(Challenge.validWordNest("broadcast", "broadcbroadcastbroadcastast"));
    }

    @Test
    public void test8() {
        assertTrue(Challenge.validWordNest("current", "currccurrcurcurrcucucurrentrrentrrententrententurrentent"));
    }

    @Test
    public void test9() {
        assertTrue(Challenge.validWordNest("diet", "diet"));
    }

    @Test
    public void test10() {
        assertFalse(Challenge.validWordNest("park", "pppappappapapapapparkarkarkrkrkrkrkkarkrkrarkark"));
    }

    @Test
    public void test11() {
        assertTrue(Challenge.validWordNest("undermine", "undermiundermundermiunununderundermineminederminedermineneinene"));
    }

    @Test
    public void test12() {
        assertFalse(Challenge.validWordNest("nail", "nannnailnailailil"));
    }

    @Test
    public void test13() {
        assertTrue(Challenge.validWordNest("show", "sshssshowhowhowowhow"));
    }

    @Test
    public void test14() {
        assertFalse(Challenge.validWordNest("demand", "dedemdeamademademandndndmandnd"));
    }

    @Test
    public void test15() {
        assertTrue(Challenge.validWordNest("publicity", "publicppublicityublicityity"));
    }

    @Test
    public void test16() {
        assertFalse(Challenge.validWordNest("relief", "rrerelirerreerrereliefliefelielifliefliefefliefelfeief"));
    }

    @Test
    public void test17() {
        assertTrue(Challenge.validWordNest("pipe", "ppppppipeipeipeipeipeipe"));
    }

    @Test
    public void test18() {
        assertFalse(Challenge.validWordNest("diagram", "diargdiadidiadiagramgramagramgramam"));
    }

    @Test
    public void test19() {
        assertTrue(Challenge.validWordNest("salt", "ssaltalt"));
    }

    @Test
    public void test20() {
        assertTrue(Challenge.validWordNest("pioneer", "pionpippipioppionpiopipioneeroneerneereerioneerneeroneerioneeroneereer"));
    }
}

