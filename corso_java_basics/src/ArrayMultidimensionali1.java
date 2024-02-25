public class ArrayMultidimensionali1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {4, 8, 3,},
                {4, 5, 6,},
                {7, 8, 9,},
        };

        System.out.println(sumFirstLine(matrix));
    }

    public static int sumFirstLine(int[][] matrix) {
        int result = 0;

        for(int i = 0; i < matrix[0].length; i++) {
            result += matrix[0][i];
        }

        return result;
    }
}
