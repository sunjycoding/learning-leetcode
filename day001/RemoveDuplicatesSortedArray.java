package day001;

/**
 * 26. Remove Duplicates from Sorted Array
 *
 * @author created by sunjy on 10/29/24
 */
public class RemoveDuplicatesSortedArray {

    public int removeDuplicates(int[] nums) {
        int slowIndex = 1;
        for (int fastIndex = 1; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex - 1]) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

}
