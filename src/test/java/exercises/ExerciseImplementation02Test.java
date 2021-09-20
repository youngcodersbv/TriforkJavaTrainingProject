package exercises;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ExerciseImplementation02Test {

    @Test
    public void testSimple() {
        int[] unsorted =  new int[]{4, 2, 5, 1, 3};
        int[] sorted = new int[]{1, 2, 3, 4, 5};

        assertArrayEquals(sorted, ExerciseImplementation02.bubbleSort(unsorted));

    }

}
