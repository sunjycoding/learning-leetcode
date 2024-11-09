package day011;

import java.util.Arrays;

/**
 * 2656. Maximum Sum With Exactly K Elements
 *
 * @author created by sunjy on 11/8/24
 */
public class MaximumSumWithExactlyKElements {

    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        int lastIndex = nums.length - 1;
        for (int i = 0; i < k; i++) {
            sum += nums[lastIndex];
            nums[lastIndex]++;
        }
        return sum;
    }

}
