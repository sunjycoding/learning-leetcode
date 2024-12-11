package day019;

/**
 * 1572. Matrix Diagonal Sum
 *
 * @author created by sunjy on 11/25/24
 */
public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += mat[i][i];
        }
        for (int i = 0; i < size; i++) {
            sum += mat[i][size - i - 1];
        }
        if (size % 2 == 1) {
            return sum - mat[size / 2][size / 2];
        }
        return sum;
    }

}
