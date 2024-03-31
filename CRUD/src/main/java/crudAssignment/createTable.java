 package crudAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud", "root", "122640");
		Statement st = con.createStatement();
		
		st.execute("create table Registration(id int primary key ,name varchar(255) not null,email varchar(255) not null,dateofbirth date)");
		System.out.println("table created successfully");

	}

}
