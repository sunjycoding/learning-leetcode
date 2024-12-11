package day020;

/**
 * 509. Fibonacci Number
 *
 * @author created by sunjy on 11/28/24
 */
public class FibonacciNumber {

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int prev1 = 0;
        int prev2 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

}
