import java.sql.*;
class Dbinsert
{
public static void main(String arg[])
{
Connection con;
Statement stmt;
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demointern","root","");
	stmt = con.createStatement();
	int k = stmt.executeUpdate("insert into student values(1,'abc','cs','abc@gmail.com','9988446611')");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
