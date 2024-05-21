import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentTable {
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

            // SQL query to create the student table
            String createTableSQL = "CREATE TABLE student ("
                    + "roll_number INT NOT NULL, "
                    + "name VARCHAR(100) NOT NULL, "
                    + "dept VARCHAR(50) NOT NULL, "
                    + "email VARCHAR(100), "
                    + "phone VARCHAR(15), "
                    + "PRIMARY KEY (roll_number))";

            // Execute the query
            statement.executeUpdate(createTableSQL);

            System.out.println("Table 'student' created successfully.");
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
