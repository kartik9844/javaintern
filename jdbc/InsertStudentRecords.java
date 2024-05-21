import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nippani"; // URL for the database
        String username = "root"; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        Connection connection = null;
        Statement statement = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // SQL queries to insert values into the student table
            String[] insertQueries = {
                "INSERT INTO student (roll_number, name, dept, email, phone) VALUES (1, 'John Doe', 'Computer Science', 'john.doe@example.com', '1234567890')",
                "INSERT INTO student (roll_number, name, dept, email, phone) VALUES (2, 'Jane Smith', 'Electrical Engineering', 'jane.smith@example.com', '0987654321')",
                "INSERT INTO student (roll_number, name, dept, email, phone) VALUES (3, 'Mike Johnson', 'Mechanical Engineering', 'mike.johnson@example.com', '1122334455')",
                "INSERT INTO student (roll_number, name, dept, email, phone) VALUES (4, 'Emily Davis', 'Civil Engineering', 'emily.davis@example.com', '2233445566')",
                "INSERT INTO student (roll_number, name, dept, email, phone) VALUES (5, 'William Brown', 'Information Technology', 'william.brown@example.com', '3344556677')"
            };

            // Execute each insert query
            for (String query : insertQueries) {
                statement.executeUpdate(query);
            }

            System.out.println("Inserted 5 records into the 'student' table.");
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
