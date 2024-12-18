package day027;

/**
 * 3264. Final Array State After K Multiplication Operations I
 *
 * @author created by sunjy on 12/16/24
 */
public class FinalArrayStateAfterKMultiplicationOperationsI {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while (k > 0) {
            int minIndex = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }
            nums[minIndex] = nums[minIndex] * multiplier;
            k--;
        }
        return nums;
    }

}
