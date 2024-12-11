package day021;

import java.util.HashSet;

/**
 * 1346. Check If N and Its Double Exist
 *
 * @author created by sunjy on 11/30/24
 */
public class CheckIfItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : arr) {
            if (hashSet.contains(2 * n) || (n % 2 == 0 && hashSet.contains(n / 2))) {
                return true;
            }
            hashSet.add(n);
        }
        return false;
    }

}
