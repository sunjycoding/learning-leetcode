package day017;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 *
 * @author created by sunjy on 11/18/24
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(nums, 0, currentCombination, result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> currentCombination, List<List<Integer>> result) {
        result.add(new ArrayList<>(currentCombination));
        for (int i = index; i < nums.length; i++) {
            currentCombination.add(nums[i]);
            backtrack(nums, i + 1, currentCombination, result);
            currentCombination.removeLast();
        }
    }

}
