package day027;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1636. Sort Array by Increasing Frequency
 *
 * @author created by sunjy on 12/16/24
 */
public class SortArrayIncreasingFrequency {

    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Integer[] boxedNums = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        Arrays.sort(boxedNums, (a, b) -> {
            int freqA = freqMap.get(a);
            int freqB = freqMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB);
            }
            return Integer.compare(b, a);
        });

        return Arrays.stream(boxedNums).mapToInt(Integer::intValue).toArray();
    }

}
