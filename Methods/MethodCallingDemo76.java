public class MethodCallingDemo76 {

    // Method to calculate the square of a number
    public static int calculateSquare(int num) {
        return num * num;
    }

    // Method to display the square of a number using calculateSquare method
    public static void displaySquare(int number) {
        int square = calculateSquare(number);
        System.out.println("The square of " + number + " is: " + square);
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Define a number
        int num = 5;

        // Call the displaySquare method to calculate and display the square
        displaySquare(num);
    }
}
