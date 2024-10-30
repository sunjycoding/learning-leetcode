package day001;

/**
 * 35. Search Insert Position
 *
 * @author created by sunjy on 10/29/24
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}
