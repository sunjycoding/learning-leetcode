package day016;

import java.util.ArrayList;
import java.util.List;

/**
 * 216. Combination Sum III
 *
 * @author created by sunjy on 11/14/24
 */
public class CombinationSumIII {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(k, n, 0, 1, currentCombination, result);
        return result;
    }

    private void backtrack(int k, int n, int sum, int start, List<Integer> currentCombination, List<List<Integer>> result) {
        if (currentCombination.size() == k) {
            if (sum == n) {
                result.add(new ArrayList<>(currentCombination));
            }
            return;
        }

        for (int i = start; i <= 9; i++) {
            if (sum + i > n) {
                break;
            }
            currentCombination.add(i);
            backtrack(k, n, sum + i, i + 1, currentCombination, result);
            currentCombination.removeLast();
        }
    }

}
