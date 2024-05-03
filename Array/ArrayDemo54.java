public class ArrayDemo54 {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = new int[5];
	string []name = new string[];

        // Assign values to the array elements
        numbers[0] = 1;
        numbers[1] = 20;
        numbers[2] = 3;
        numbers[3] = 40;
        numbers[4] = 5;

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate and print the sum of array elements
        int sum = 0;
        for (int num : numbers) {
            sum =sum +num;
        }
        System.out.println("Sum of array elements: " + sum);

        // Calculate and print the average of array elements
        double average = sum / 5;
        System.out.println("Average of array elements: " + average);

        // Count the number of even and odd elements in the array
        int evenCount = 0, oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
