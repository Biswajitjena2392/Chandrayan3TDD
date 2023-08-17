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
    void ShouldReturnThePositionAfterMakingOneMoveForward(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"f"});
        assertArrayEquals(new int[]{0,1,0},finalcoordinates);
    }
    @Test
    void ShouldReturnThePositionAfterMakingOneMoveBackWard(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"b"});
        assertArrayEquals(new int[]{0,-1,0},finalcoordinates);
    }
    @Test
    void TurnRight(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"r"});
        assertArrayEquals(new int[]{0,0,0},finalcoordinates);
    }
    @Test
    void TurnRightAndMoveForward(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"r","f"});
        assertArrayEquals(new int[]{1,0,0},finalcoordinates);
    }
    @Test
    void TurnRightAndMoveBackWard(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"r","b"});
        assertArrayEquals(new int[]{-1,0,0},finalcoordinates);
    }
    @Test
    void TurnLeft(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"l"});
        assertArrayEquals(new int[]{0,0,0},finalcoordinates);
    }

    @Test
    void TurnLeftAndMoveForward(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"l","f"});
        assertArrayEquals(new int[]{-1,0,0},finalcoordinates);
    }

    @Test
    void TurnLeftAndMoveBackward(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"l","b"});
        assertArrayEquals(new int[]{1,0,0},finalcoordinates);
    }

    @Test
    void FaceUp(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"u"});
        assertArrayEquals(new int[]{0,0,0},finalcoordinates);
    }

    @Test
    void FaceUpAndMoveForward(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"u","f"});
        assertArrayEquals(new int[]{0,0,1},finalcoordinates);
    }

    @Test
    void FaceUpAndMoveBackward(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"u","b"});
        assertArrayEquals(new int[]{0,0,-1},finalcoordinates);
    }
    @Test
    void FaceDown(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"d"});
        assertArrayEquals(new int[]{0,0,0},finalcoordinates);
    }

    @Test
    void FaceDownAndMoveForward(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"d","f"});
        assertArrayEquals(new int[]{0,0,-1},finalcoordinates);
    }

    @Test
    void FaceDownAndMoveBackWard(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"d","b"});
        assertArrayEquals(new int[]{0,0,1},finalcoordinates);
    }
    @Test
    void MultipleForwardAndBackwardMovements(){
        int[] finalcoordinates=Chandrayaan3.finalPosition(new String[]{"f","f","f","f","f","b","b"});
        assertArrayEquals(new int[]{0,3,0},finalcoordinates);
    }

    @Test
    void ShouldReturnPositionAfterChangingDirectionAndMovingOnce(){
        int[] finalcoordinates=Chandrayaan3.finalPosition((new String[]{"r","b"}));
        assertArrayEquals(new int[]{-1,0,0},finalcoordinates);
    }

    @Test
    void QuestionTestCase(){
        int[] finalcoordinates=Chandrayaan3.finalPosition((new String[]{"f","r","u","b","l"}));
        assertArrayEquals(new int[]{0,1,-1},finalcoordinates);
    }
    @Test
    void zigzagMovement(){
        int[] finalcoordinates=Chandrayaan3.finalPosition((new String[]{"f","r","f","l","f","r","f","l"}));
        assertArrayEquals(new int[]{2,2,0},finalcoordinates);
    }
    @Test
    void ReturnPositonAfterJustChangingDirectionMultipleTimes(){
        int[] finalcoordinates=Chandrayaan3.finalPosition((new String[]{"u","r","d","l"}));
        assertArrayEquals(new int[]{0,0,0},finalcoordinates);
    }
}