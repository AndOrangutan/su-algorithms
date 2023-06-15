package array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class StrassenMatrixMultTest {
    @Test
    void strassenMatrixMultTest() {
        float[][] inputX = { 
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 2, 2, 2, 2 } };
        float[][] inputY = { 
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 2, 2, 2, 2 } };
        float[][] expected = { 
                { 8, 8, 8, 8 },
                { 16, 16, 16, 16 },
                { 24, 24, 24, 24 },
                { 16, 16, 16, 16 } };

        float[][] result = StrassenMatrixMult.mult(inputX,inputY);

        assertArrayEquals(expected, result);
    }

}
