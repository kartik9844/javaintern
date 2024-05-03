public class SubtractMatrices67 {

    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrix2 = { {7, 8, 9}, {10, 11, 12} };

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] resultMatrix = new int[rows][cols];

        System.out.println("Matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nResultant Matrix after subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
