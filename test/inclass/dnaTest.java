package inclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class dnaTest {


    @Test
    void pleaseWork() {
        assertEquals("1 2 3 4", dna.count("ACCGGGTTTT"));
    }

    @Test
    void pleaseWork2() {
        assertEquals("20 12 17 21", dna.count("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"));
    }
}