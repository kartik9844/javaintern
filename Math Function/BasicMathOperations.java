import java.util.Scanner;

public class BasicMathOperations 
{
    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double sum = Math.addExact((int) num1, (int) num2);
        double difference = Math.subtractExact((int) num1, (int) num2);
        double product = Math.multiplyExact((int) num1, (int) num2);
        double quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close();
    }
}
