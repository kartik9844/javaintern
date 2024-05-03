public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Appending text to the StringBuffer
        stringBuffer.append(" World");

        // Inserting text at a specific position
        stringBuffer.insert(5, " Java");

        // Deleting characters from the StringBuffer
        stringBuffer.delete(0, 6); // Deleting "Hello "

        // Updating characters in the StringBuffer
        stringBuffer.setCharAt(0, 'h'); // Changing 'W' to 'w'

        // Reversing the StringBuffer
        stringBuffer.reverse();

        // Converting the StringBuffer to a String
        String result = stringBuffer.toString();

        // Printing the final result
        System.out.println(result);
    }
}
