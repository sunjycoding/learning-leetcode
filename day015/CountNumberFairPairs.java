package day015;

import java.util.Arrays;

/**
 * 2563. Count the Number of Fair Pairs
 *
 * @author created by sunjy on 11/12/24
 */
public class CountNumberFairPairs {

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLess(nums, upper) - countLess(nums, lower - 1);
    }

    private long countLess(int[] nums, int sum) {
        long res = 0;
        int n = nums.length;
        for (int i = 0, j = n - 1; i < j; ++i) {
            while (i < j && nums[i] + nums[j] > sum) {
                j--;
            }
            res += j - i;
        }
        return res;
    }

}
