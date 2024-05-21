import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStudentRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nippani"; // URL for the database
        String username = "root"; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        int rollNumberToDelete = 3; // Replace with the roll number of the student you want to delete

        Connection connection = null;
        Statement statement = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // SQL query to delete a record from the student table
            String deleteSQL = "DELETE FROM student WHERE roll_number = " + rollNumberToDelete;

            // Execute the delete query
            int rowsAffected = statement.executeUpdate(deleteSQL);

            if (rowsAffected > 0) {
                System.out.println("Record with roll number " + rollNumberToDelete + " was deleted successfully.");
            } else {
                System.out.println("No record found with roll number " + rollNumberToDelete);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
