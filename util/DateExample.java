import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // Creating a Date object with the current date and time
        Date currentDate = new Date();

        // Getting date components
        int day = currentDate.getDate();
        int month = currentDate.getMonth() + 1; // Adding 1 because months are zero-based
        int year = currentDate.getYear() + 1900; // Adding 1900 because years are represented as years since 1900

        // Getting time components
        int hours = currentDate.getHours();
        int minutes = currentDate.getMinutes();

        System.out.println("Current Date and Time: " + currentDate);
        System.out.println("Date Components: " + day + "/" + month + "/" + year);
        System.out.println("Time Components: " + hours + ":" + minutes);

        // Modifying date and time components
        currentDate.setHours(15);
        currentDate.setMinutes(30);

        System.out.println("Modified Date and Time: " + currentDate);
    }
}
