package day031;

/**
 * 1512. Number of Good Pairs
 *
 * @author created by sunjy on 1/1/25
 */
public class NumberGoodPairs {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
