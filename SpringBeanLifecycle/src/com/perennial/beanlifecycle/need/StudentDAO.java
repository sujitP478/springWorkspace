package com.perennial.beanlifecycle.need;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//creating and closing connection common things we r doing repeatedly 
//to avoid these we use spring ....refer pkg=springbeanlifecycle

public class StudentDAO {
	public static final String query1="select * from StudentInfo";
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/HostelStudentInfo";
	private String user="root";
	private String pass="Pere@123";
	static Connection con=null;

	public void fetchData() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		 con=DriverManager.getConnection(url, user, pass);
		 System.out.println("Connection established");
		 Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query1);
		while(rs.next()) {
			int sid=rs.getInt(1);
			String sname=rs.getString(2);
			double fee=rs.getDouble(3);
			String foodType=rs.getString(4);
			System.out.println(sid+"   "+sname+"   "+fee+"   "+foodType);
		}
		con.close();
	}
	public void deleteRecord(int sid) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		 con=DriverManager.getConnection(url, user, pass);
		 System.out.println("Connection established");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from StudentInfo where Student_ID= "+sid);
		System.out.println("deleted Record = "+sid);
		con.close();
	}
}
