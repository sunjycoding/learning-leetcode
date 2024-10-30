package day001;

/**
 * 69. Sqrt(x)
 *
 * @author created by sunjy on 10/29/24
 */
public class SqrtX {

    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 1;
        int right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long cal = (long) mid * mid;
            if (cal < x) {
                left = mid + 1;
            } else if (cal > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left - 1;
    }

}
