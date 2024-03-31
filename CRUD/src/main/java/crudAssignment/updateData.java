package crudAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","122640");
		Statement st = con.createStatement();
		
		st.execute("update Registration set name='Amy' where id = 2");
		//updating the name of id = 2 with Amy 
		
		System.out.println("data updated successfully");

	}

}
