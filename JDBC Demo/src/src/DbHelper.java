package src;
import java.sql.*;

public class DbHelper {
	static String username="root";
	static String password="sifreyiburayayazicaksiniz:)";
	static String dbUrl="jdbc:mysql://localhost:3306/school";
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbUrl,username,password);
	}
	
	public void error_message(SQLException e){System.out.println("message: "+ e.getMessage());}
	
}
