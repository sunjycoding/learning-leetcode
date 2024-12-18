package day026;

import java.util.ArrayList;
import java.util.List;

/**
 * @author created by sunjy on 12/14/24
 */
public class SortPeople {

    public String[] sortPeople(String[] names, int[] heights) {
        List<int[]> people = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            people.add(new int[]{heights[i], i});
        }

        people.sort((a, b) -> b[0] - a[0]);

        String[] result = new String[names.length];
        for (int i = 0; i < people.size(); i++) {
            result[i] = names[people.get(i)[1]];
        }

        return result;
    }

}
