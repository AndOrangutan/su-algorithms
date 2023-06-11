package sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;



public class BubbleSortTest {
    @Test
    void bubbleSortTest() {
        int[] input = { 12, 222, 15, 76, 43, 500, 23, 8, 65, 32, 69, 420, 344, 6754 };
        int[] expected = { 8, 12, 15, 23, 32, 43, 65, 69, 76, 222, 344, 420, 500, 6754 };

        BubbleSort.bubbleSort(input, 14);
        assertArrayEquals(expected, input);

    }
}
