public class ElementFrequency62 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 1, 3};

        System.out.println("Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nFrequency of each element:");
        int n = arr.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + ": " + count);
            }
        }
    }
}
