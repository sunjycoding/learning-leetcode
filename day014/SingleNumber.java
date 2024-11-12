package day014;

/**
 * 136. Single Number
 *
 * @author created by sunjy on 11/11/24
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

}
