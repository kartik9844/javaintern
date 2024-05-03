import java.time.LocalDate;

public class DateAfterDaysExample {
    public static void main(String[] args) {
        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Adding 45 days to the current date
        LocalDate dateAfter45Days = currentDate.plusDays(45);

        // Displaying the date after 45 days
        System.out.println("Current Date: " + currentDate);
        System.out.println("Date after 45 days: " + dateAfter45Days);
    }
}
