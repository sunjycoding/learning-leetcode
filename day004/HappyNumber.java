package day004;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. Happy Number
 *
 * @author created by sunjy on 11/1/24
 */
public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> hashSet = new HashSet<>();
        while (true) {
            int sum = getSum(n);
            if (sum == 1) {
                return true;
            }
            if (hashSet.contains(sum)) {
                return false;
            } else {
                hashSet.add(sum);
            }
            n = sum;
        }
    }

    private int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }
        return sum;
    }

}
