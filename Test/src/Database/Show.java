package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Show {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root", null);
	ResultSet resultSet= connection.prepareStatement("select*from test").executeQuery();
	
	while(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
	}
	connection.close();
	

}
}