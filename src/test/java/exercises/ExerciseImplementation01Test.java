package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
