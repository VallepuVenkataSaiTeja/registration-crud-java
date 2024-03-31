package crudAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class readData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "122640");
		Statement st=con.createStatement();
		
	    ResultSet rs = st.executeQuery("select * from Registration where id = 1");
	    //fetching the data of person where id=1
	    rs.next();
	    
	    System.out.println(rs.getInt(1));
	    System.out.println(rs.getString(2));
	    System.out.println(rs.getString(3));
	    System.out.println(rs.getString(4));
	}
   
}
