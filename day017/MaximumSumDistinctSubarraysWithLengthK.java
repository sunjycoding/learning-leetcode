package day017;

import java.util.HashSet;

/**
 * 2461. Maximum Sum of Distinct Subarrays With Length K
 *
 * @author created by sunjy on 11/18/24
 */
public class MaximumSumDistinctSubarraysWithLengthK {

    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long maxSum = 0;
        long currentSum = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {
            while (hashSet.contains(nums[right])) {
                hashSet.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }
            hashSet.add(nums[right]);
            currentSum += nums[right];

            if (right - left + 1 > k) {
                hashSet.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}
