import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            String url = "jdbc:mysql://localhost:3306/demointerns";
            String username = "root";
            String password = "";

            Connection connection = DriverManager.getConnection(url, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute the query
            String query = "SELECT * FROM student";
            ResultSet resultSet = statement.executeQuery(query);

            // Process the result set
            while (resultSet.next()) {
                int roll = resultSet.getInt("roll");
                String name = resultSet.getString("Name");
		String dept = resultSet.getString("dept");
                String email = resultSet.getString("email");
		String phone = resultSet.getString("phone");
                System.out.println("ROLL: " + roll + ", Name: " + name + ", Email: " + email +", dept: "+ dept +", phone"+phone);
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}