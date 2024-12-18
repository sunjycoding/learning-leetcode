package day028;

import java.util.Arrays;

/**
 * 179. Largest Number
 *
 * @author created by sunjy on 12/17/24
 */
public class LargestNumber {

    public String largestNumber(int[] nums) {
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if ("0".equals(strNums[0])) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strNums) {
            result.append(str);
        }

        return result.toString();
    }

}
