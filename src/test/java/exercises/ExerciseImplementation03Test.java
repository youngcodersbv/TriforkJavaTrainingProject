package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseImplementation03Test {

    @Test
    public void testSimple() {
        String unsorted =  "the quick brown fox jumps over the lazy dog";
        String sorted = "        abcdeeefghhijklmnooopqrrsttuuvxyz";

        assertEquals(sorted, ExerciseImplementation03.bubbleSort(unsorted));

    }

}
