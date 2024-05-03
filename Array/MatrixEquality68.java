public class MatrixEquality68 {

    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrix2 = { {1, 2, 3}, {4, 5, 6} };

        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (rows1 != rows2 || cols1 != cols2) {
            System.out.println("Matrices are not equal. They have different dimensions.");
            return;
        }

        boolean isEqual = true;

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

        System.out.println("\nChecking equality of matrices...");

        // Check element-wise equality
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    isEqual = false;
                    break;
                }
            }
            if (!isEqual) {
                break;
            }
        }

        if (isEqual) {
            System.out.println("Matrices are equal.");
        } else {
            System.out.println("Matrices are not equal.");
        }
    }
}
