public class MultiplyMatrices66 {

    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrix2 = { {7, 8}, {9, 10}, {11, 12} };

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Cannot multiply matrices. Number of columns in the first matrix must be equal to the number of rows in the second matrix.");
            return;
        }

        int[][] resultMatrix = new int[rows1][cols2];

        System.out.println("Matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nResultant Matrix after multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
