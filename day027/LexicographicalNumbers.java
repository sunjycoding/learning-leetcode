package day027;

import java.util.ArrayList;
import java.util.List;

/**
 * 386. Lexicographical Numbers
 *
 * @author created by sunjy on 12/16/24
 */
public class LexicographicalNumbers {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(i, n, result);
        }
        return result;
    }

    private void dfs(int curr, int n, List<Integer> result) {
        if (curr > n) {
            return;
        }
        result.add(curr);
        for (int i = 0; i <= 9; i++) {
            int next = curr * 10 + i;
            if (next > n) {
                break;
            }
            dfs(next, n, result);
        }
    }

}
