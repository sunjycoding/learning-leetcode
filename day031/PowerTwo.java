package day031;

/**
 * 231. Power of Two
 *
 * @author created by sunjy on 1/1/25
 */
public class PowerTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }

}
