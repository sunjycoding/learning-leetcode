package day001;

/**
 * 27. Remove Element
 *
 * @author created by sunjy on 10/29/24
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (val != nums[fastIndex]) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

}
