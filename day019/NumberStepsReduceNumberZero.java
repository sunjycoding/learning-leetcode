package day019;

/**
 * 1342. Number of Steps to Reduce a Number to Zero
 *
 * @author created by sunjy on 11/25/24
 */
public class NumberStepsReduceNumberZero {

    public int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            step++;
        }
        return step;
    }

}
