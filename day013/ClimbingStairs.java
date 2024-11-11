package day013;

/**
 * 70. Climbing Stairs
 *
 * @author created by sunjy on 11/10/24
 */
public class ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1;
        int b = 2;
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

}
