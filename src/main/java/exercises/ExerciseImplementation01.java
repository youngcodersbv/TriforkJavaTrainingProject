package exercises;

public class ExerciseImplementation01 {
    public static int fibonacci(int n) {

        int a = 0;
        int b = 1;
        int x = 0;

        if (n < 0) {
            throw new Error(String.format("This is not allowed for n is %d", n));
        } else if (n == 0) {
            x = a;
        } else if (n == 1) {
            x = b;
        } else {
            for (int i=n-1; i>0; i--) {
                x = a+b;
                a = b;
                b = x;
            }
        }

        return x;
    }
}
