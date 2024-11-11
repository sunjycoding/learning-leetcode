package day013;

/**
 * 3097. Shortest Subarray With OR at Least K II
 *
 * @author created by sunjy on 11/10/24
 */
public class ShortestSubarrayWithORLeastKII {

    public int minimumSubarrayLength(int[] nums, int k) {
        for (int num : nums) {
            if (num >= k) {
                return 1;
            }
        }

        int n = nums.length;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int orResult = nums[i];

            if (orResult >= k) {
                return 1;
            }

            for (int j = i + 1; j < n && j - i + 1 < result; j++) {
                orResult |= nums[j];

                if (orResult >= k) {
                    result = Math.min(result, j - i + 1);
                    break;
                }
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }

}
