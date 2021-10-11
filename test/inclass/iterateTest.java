package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class iterateTest {


    @Test
    void patternWorks() {
        String small = "ac";
        String big = "abracadabra";
        assertEquals(3, iterate.pattern(small, big));
    }

    @Test
    void patternWorks2() {
        String small = "lmno";
        String big = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(11, iterate.pattern(small, big));
    }

    @Test
    void patternWorks3() {
        String small = "ross";
        String big = "adamadamrossrossadamross";
        assertEquals(8, iterate.pattern(small, big));
    }

    @Test
    void patternWorks4() {
        String small = "woodchuck";
        String big = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?";
        assertEquals(22, iterate.pattern(small, big));
    }

    @Test
    void doesNotFindPattern() {
        String small = "nope";
        String big = "this is not the string you are looking for";
        assertEquals(-1, iterate.pattern(small, big));
    }
}