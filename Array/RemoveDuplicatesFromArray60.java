public class RemoveDuplicatesFromArray60 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 1, 3};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int n = arr.length;
        int len = n;

        // Loop through the array
        for (int i = 0; i < len; i++) {
            // Check if the current element is not -1 (which means it's already processed)
            if (arr[i] != -1) {
                // Check for duplicates starting from the next element
                for (int j = i + 1; j < len; j++) {
                    // If a duplicate is found, mark it as -1
                    if (arr[i] == arr[j]) {
                        arr[j] = -1;
                    }
                }
            }
        }

        // Shift non-duplicate elements to the beginning of the array
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] != -1) {
                arr[index++] = arr[i];
            }
        }

        // Resize the array to remove the duplicates
        int[] result = new int[index];
        System.arraycopy(arr, 0, result, 0, index);
        arr = result;

        System.out.println("\nArray after removing duplicates:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
