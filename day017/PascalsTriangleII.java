package day017;

import java.util.ArrayList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 *
 * @author created by sunjy on 11/18/24
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            result.add(1);
        }

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                result.set(j, result.get(j - 1) + result.get(j));
            }
        }

        return result;
    }

}
