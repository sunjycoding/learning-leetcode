package day004;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 *
 * @author created by sunjy on 11/1/24
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (hashMap.containsKey(diff)) {
                return new int[]{i, hashMap.get(diff)};
            }
            hashMap.put(num, i);
        }
        return null;
    }

}
