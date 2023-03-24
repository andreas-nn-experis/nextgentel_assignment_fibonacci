import java.util.ArrayList;

public class Fibonacci {
    // Calls the fibonnaciN function the appropriate number of times.
    public static ArrayList<Integer> getFibonacciNumbers(int input) {
        if (input >= 0) {
            ArrayList<Integer> fibSequence = new ArrayList<Integer>();

            // We want to start the sequence with 1 and 1, so we start the loop at 1
            // rather than 0, and run it until n <= input (rather than < input).
            for (int n = 1; n <= input; n++) {
                fibSequence.add(fibonacciN(n));
            }
            return fibSequence;
        } else {
            throw new RuntimeException("Invalid parameter: must be equal to or greater than 0.");
        }
    }

    // Uses recursion to do its magic.
    private static Integer fibonacciN(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return (fibonacciN(n - 1) + fibonacciN(n - 2));
        }
    }
}
