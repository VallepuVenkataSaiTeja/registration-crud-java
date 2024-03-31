package crudAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "122640");
		Statement st=con.createStatement();
		st.execute("delete from Registration where id=4");
		//deleting the person details where id=4 

		System.out.println("data deleted successfully");

	}

}
