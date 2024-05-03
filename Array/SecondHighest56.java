import java.util.Arrays;

public class SecondHighest56 {
    public static void main(String[] args) {
        int[] array = {10, 30, 20, 50, 40};
        Arrays.sort(array);
        int secondHighest = array[array.length - 2];
        System.out.println("Second highest number: " + secondHighest);
    }
}
