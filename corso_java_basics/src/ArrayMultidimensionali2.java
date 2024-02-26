import java.util.Arrays;

public class ArrayMultidimensionali2 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3,},
                {4, 5, 6,},
        };

        changeDimension(matrix1);
    }

    public static void changeDimension(int[][] matrix) {
        int num1 = matrix[0].length;
        int num2 = matrix.length;

        int[][] matrix2 = new int[num1][num2];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix2[i][j] = matrix[j][i];
            }
        }

        System.out.println(Arrays.deepToString(matrix2));
    }
}
