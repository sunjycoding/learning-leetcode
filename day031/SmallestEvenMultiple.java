package day031;

/**
 * 2413. Smallest Even Multiple
 *
 * @author created by sunjy on 1/1/25
 */
public class SmallestEvenMultiple {

    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) {
            return n;
        }
        return n * 2;
    }

}
