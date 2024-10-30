package day001;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 *
 * @author created by sunjy on 10/29/24
 */
public class FindFirstLastPositionElementSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirstPosition(nums, target);
        result[1] = findLastPosition(nums, target);
        return result;
    }

    public int findFirstPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                position = mid;
                right = mid - 1;
            }
        }
        return position;
    }

    public int findLastPosition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int position = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                position = mid;
                left = mid + 1;
            }
        }
        return position;
    }

}
