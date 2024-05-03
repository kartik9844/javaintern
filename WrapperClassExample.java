public class WrapperClassExample {
    public static void main(String[] args) {
        // Using wrapper class for int
        Integer intObj = new Integer(10);
        int intValue = intObj.intValue();
        System.out.println("Wrapper class for int: " + intObj + ", Unwrapped value: " + intValue);

        // Using autoboxing and unboxing
        Integer num = 20; // autoboxing
        int result = num + 5; // unboxing
        System.out.println("Autoboxing and unboxing: " + result);
    }
}
