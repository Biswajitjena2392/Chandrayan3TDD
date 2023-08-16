package tdd.cyaan3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chandrayaan3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void finalPosition() {
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{""});
        assertArrayEquals(new int[]{0, 0, 0},finalcoordinates);
    }
}