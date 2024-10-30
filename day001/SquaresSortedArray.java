package day001;

/**
 * 977. Squares of a Sorted Array
 *
 * @author created by sunjy on 10/29/24
 */
public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int left = 0;
        int right = length - 1;
        for (int i = length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

}
