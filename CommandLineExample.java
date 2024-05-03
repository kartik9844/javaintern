public class CommandLineExample {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Command-line arguments provided:");
            // Print each command-line argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
