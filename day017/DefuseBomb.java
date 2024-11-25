package day017;

/**
 * 1652. Defuse the Bomb
 *
 * @author created by sunjy on 11/18/24
 */
public class DefuseBomb {

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        int start = k > 0 ? 1 : k;
        int end = k > 0 ? k : -1;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = start; j <= end; j++) {
                sum += code[(i + j + n) % n];
            }
            result[i] = sum;
        }
        return result;
    }

}
