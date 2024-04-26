package jdbc_28_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc//to see press ctrl+c then ctrl+shift+r to see presence

{

	

		static final String DB_URL = "jdbc:mysql://localhost:3306/advance_java?useSSL=false";
		static final String user = "root";
		static final String pass = "rohininb@01234";
		static final String query = "select *from advance_java.student1";

		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//open connetion
			
			Connection con= DriverManager.getConnection(DB_URL, user, pass);
			Statement s= con.createStatement();
			
			ResultSet rs = s.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("id" + rs.getString("st_id"));

				System.out.println("name:" + rs.getString("name"));
				System.out.println("address" + rs.getString("address"));
			}
			
			s.executeUpdate("update advance_java.student1 set address = 'nagpur' where st_id =3");
			ResultSet rs1 = s.executeQuery(query);
			
			while(rs1.next())
			{
				System.out.println("id" + rs1.getString("st_id"));

				System.out.println("name:" + rs1.getString("name"));
				System.out.println("address" + rs1.getString("address"));
			}
			
			
		}

}
