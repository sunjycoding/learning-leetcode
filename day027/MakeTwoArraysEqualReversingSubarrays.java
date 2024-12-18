package day027;

import java.util.HashMap;

/**
 * 1460. Make Two Arrays Equal by Reversing Subarrays
 *
 * @author created by sunjy on 12/16/24
 */
public class MakeTwoArraysEqualReversingSubarrays {

    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : target) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        for (int num : arr) {
            if (!count.containsKey(num)) {
                return false;
            }
            count.put(num, count.get(num) - 1);
            if (count.get(num) == 0) {
                count.remove(num);
            }
        }

        return count.isEmpty();
    }

}
