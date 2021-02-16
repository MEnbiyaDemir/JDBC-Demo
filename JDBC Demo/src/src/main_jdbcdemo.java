package src;

import java.sql.*;
import java.util.ArrayList;

public class main_jdbcdemo {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		selectDemo();
		insertDemo();

}
		
		
		public static void insertDemo(){
			Connection connection=null;
			DbHelper dbhelp=new DbHelper();
			
			PreparedStatement statement=null;
			ResultSet result;
			
			ArrayList<School> sclist=new ArrayList<School>();
			
			try {
				System.out.println("Baglanti olustu. Insert islemi... ");
				
				connection= dbhelp.getConnection();
				statement = connection.prepareStatement("insert into student (student_no,student_name,student_country) values('31231','gökhan','deutschland')");
				statement.executeLargeUpdate(); //çalýþtýr
				
				//VEYA String sql="insert into student (student_no,student_name,student_country) values(?,?,?)";
				// statement = connection.prepareStatement(sql);
				// statement.setString(1,'31231'); gibi olabilir bunu da kullanýcýdan alabilirsin
				
	           System.out.println("Kayýt eklendi.");
	           
				statement.close();
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	             dbhelp.error_message(e);
	   }
		}

		public static void selectDemo(){
			
			Connection connection=null;
			DbHelper dbhelp=new DbHelper();
			
			Statement statement=null;
			ResultSet result;
			
			ArrayList<School> sclist=new ArrayList<School>();
			
			try {
				connection= dbhelp.getConnection();
				statement = connection.createStatement();

				System.out.println("Baglanti olustu. Pull islemi... ");
				
				result= statement.executeQuery("select ID,student_no,student_name,student_country from student ");
	           
				while(result.next()){
					// System.out.println(result.getString("student_name"));
					sclist.add(
							new School 
							(result.getString("ID"),
							 result.getString("student_no"),
							 result.getString("student_name"),
							 result.getString("student_country") ));
                            }
				
				connection.close();

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	             dbhelp.error_message(e);
	   }
			System.out.println(sclist.get(2).getNo());
			System.out.println(sclist.get(2).getCountry());

		}

}	
