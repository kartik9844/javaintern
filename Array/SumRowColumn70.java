public class SumRowColumn70 {

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Sum of each row
        System.out.println("\nSum of each row:");
        for (int[] row : matrix) {
            int sum = 0;
            for (int num : row) {
                sum += num;
            }
            System.out.println(sum);
        }

        // Sum of each column
        System.out.println("\nSum of each column:");
        int cols = matrix[0].length;
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.println(sum);
        }
    }
}
