package day031;

/**
 * 1486. XOR Operation in an Array
 *
 * @author created by sunjy on 1/1/25
 */
public class XOROperationArray {

    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++) {
            int num = start + 2 * i;
            result ^= num;
        }
        return result;
    }

}
