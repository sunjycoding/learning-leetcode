package day019;

/**
 * 1492. The kth Factor of n
 *
 * @author created by sunjy on 11/25/24
 */
public class TheFactor {

    public int kthFactor(int n, int k) {
        int factor = 1;
        int order = 0;
        while (factor <= n) {
            if (n % factor == 0) {
                order++;
                if (order == k) {
                    return factor;
                }
            }
            factor++;
        }
        return -1;
    }

}
