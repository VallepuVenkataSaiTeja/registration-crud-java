package crudAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","122640");
		Statement st = con.createStatement();
		
		st.execute("insert into Registration(id,name,email,dateofbirth) values(1,'James','james@gmail.com','1998-08-22')");
		st.execute("insert into Registration(id,name,email,dateofbirth) values(2,'Emma','emma@gmail.com','1985-02-07')");
		st.execute("insert into Registration(id,name,email,dateofbirth) values(3,'Milan','milan@gmail.com','1992-11-16')");
		st.execute("insert into Registration(id,name,email,dateofbirth) values(4,'Sam','sam@gmail.com','1988-12-30')");
		st.execute("insert into Registration(id,name,email,dateofbirth) values(5,'Peter','peter@gmail.com','1993-05-02')");
		
		
		System.out.println("data inserted successfully");
	}

}
