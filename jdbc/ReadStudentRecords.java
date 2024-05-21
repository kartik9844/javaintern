import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadStudentRecords {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nippani"; // URL for the database
        String username = "root"; // Replace with your MySQL username
        String password = ""; // Replace with your MySQL password

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            statement = connection.createStatement();

            // SQL query to read data from the student table
            String query = "SELECT * FROM student";

            // Execute the query
            resultSet = statement.executeQuery(query);

            // Process and display the result set
            while (resultSet.next()) {
                int rollNumber = resultSet.getInt("roll_number");
                String name = resultSet.getString("name");
                String dept = resultSet.getString("dept");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");

                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("Department: " + dept);
                System.out.println("Email: " + email);
                System.out.println("Phone: " + phone);
                System.out.println();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
