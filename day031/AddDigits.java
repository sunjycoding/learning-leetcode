package day031;

/**
 * 258. Add Digits
 *
 * @author created by sunjy on 1/1/25
 */
public class AddDigits {

    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (num - 1) % 9;
    }

}
