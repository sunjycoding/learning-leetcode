package day019;

/**
 * 1822. Sign of the Product of an Array
 *
 * @author created by sunjy on 11/25/24
 */
public class SignProductArray {

    public int arraySign(int[] nums) {
        int prod = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                prod = -prod;
            }
        }
        return prod;
    }

}
