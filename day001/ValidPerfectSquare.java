package day001;

/**
 * 367. Valid Perfect Square
 *
 * @author created by sunjy on 10/29/24
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num == 0 | num == 1) {
            return true;
        }
        if (num < 4) {
            return false;
        }
        int left = 2;
        int right = num / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long cal = (long) mid * mid;
            if (cal < num) {
                left = mid + 1;
            } else if (cal > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
