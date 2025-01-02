package day031;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 *
 * @author created by sunjy on 1/1/25
 */
public class SubtractProductSumDigitsInteger {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }
        return product - sum;
    }

}
