public class FrequencyOddEven69 {

    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        int oddCount = 0;
        int evenCount = 0;

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            System.out.println();
        }

        System.out.println("\nFrequency of odd numbers: " + oddCount);
        System.out.println("Frequency of even numbers: " + evenCount);
    }
}
