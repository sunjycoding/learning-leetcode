package day001;

/**
 * 283. Move Zeroes
 *
 * @author created by sunjy on 10/29/24
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        for (int i = slowIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
