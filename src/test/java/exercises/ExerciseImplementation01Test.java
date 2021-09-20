package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Finacci sequence: 0, 1, 1, 2, 3, 5, 8, 13
public class ExerciseImplementation01Test {

    @Test
    public void testBasics() {
        assertEquals(0, ExerciseImplementation01.fibonacci(0));
        assertEquals(1, ExerciseImplementation01.fibonacci(1));
    }

    @Test
    public void testNextSteps() {
        assertEquals(1, ExerciseImplementation01.fibonacci(2));
        assertEquals(2, ExerciseImplementation01.fibonacci(3));
    }


    @Test
    public void testAdvanced() {
        assertEquals(3, ExerciseImplementation01.fibonacci(4));
        assertEquals(5, ExerciseImplementation01.fibonacci(5));
        assertEquals(8, ExerciseImplementation01.fibonacci(6));
        assertEquals(13, ExerciseImplementation01.fibonacci(7));
    }

    @Test
    public void addSomeMore() {
        assertEquals(21, ExerciseImplementation01.fibonacci(8));
    }

    @Test
    public void testError() {
        assertThrows(Error.class, () -> {
            ExerciseImplementation01.fibonacci(-1);
        });
    }
}
