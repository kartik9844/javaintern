public class EvenOddCount59 {
    public static void main(String[] args) {
        int[] array = {10, 20, 15, 25, 30};
        int evenCount = 0, oddCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
