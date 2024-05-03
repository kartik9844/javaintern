public class CopyArrayElements61 {

    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];

        System.out.println("Source Array:");
        for (int i = 0; i < sourceArray.length; i++) {
            System.out.print(sourceArray[i] + " ");
        }

        System.out.println("\nCopying elements to destination array...");
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("\nDestination Array:");
        for (int i = 0; i < destinationArray.length; i++) {
            System.out.print(destinationArray[i] + " ");
        }
    }
}
