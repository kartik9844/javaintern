public class SumCalculator74 {

    // Method to calculate the sum of two numbers
    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Define two numbers
        int number1 = 10;
        int number2 = 20;

        // Call the calculateSum method and store the result
        int sum = calculateSum(number1, number2);

        // Display the result
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
    }
}
