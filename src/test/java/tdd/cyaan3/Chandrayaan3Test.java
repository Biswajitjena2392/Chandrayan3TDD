package tdd.cyaan3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Chandrayaan3Test {

    @BeforeEach
    void setUp() {
    }

    @Test
    void ShouldReturnTheInitialPosition() {
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{""});
        assertArrayEquals(new int[]{0, 0, 0},finalcoordinates);
    }
    @Test
    void ShouldReturnThePositionAfterMakingOneMove(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"f"});
        assertArrayEquals(new int[]{0,1,0},finalcoordinates);
    }
}