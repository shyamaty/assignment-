package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root", null);
	PreparedStatement preparedStatement= connection.prepareStatement("insert into test values(?,?)");
	preparedStatement.setInt(1,1);
	preparedStatement.setString(2, "Shyama");
	preparedStatement.execute();
	System.out.println("the values inserted in the database");
	connection.close();
	

}
}
