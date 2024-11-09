package day011;

/**
 * 1829. Maximum XOR for Each Query
 *
 * @author created by sunjy on 11/8/24
 */
public class MaximumXOREachQuery {

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int length = nums.length;
        int[] result = new int[length];
        int xorSum = 0;
        for (int num : nums) {
            xorSum ^= num;
        }
        int maxBitValue = (1 << maximumBit) - 1;
        for (int i = 0; i < length; i++) {
            result[i] = xorSum ^ maxBitValue;
            xorSum ^= nums[length - 1 - i];
        }
        return result;
    }

}
