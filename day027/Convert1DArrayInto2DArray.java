package day027;

/**
 * 2022. Convert 1D Array Into 2D Array
 *
 * @author created by sunjy on 12/16/24
 */
public class Convert1DArrayInto2DArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index];
                index++;
            }
        }
        return result;
    }

}
