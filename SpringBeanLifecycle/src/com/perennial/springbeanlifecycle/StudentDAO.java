package com.perennial.springbeanlifecycle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {
	public static final String query1="select * from StudentInfo";

	private String driver;
	private String url;
	private String user;
	private String pass;
	Connection con=null;

	//****************************************************//
	//once object gets created internally it will call dbConnection() by itself bcoz @PostConstruct annotation
	//add <context annoation-config in xml file
	@PostConstruct
	public void init() throws SQLException, ClassNotFoundException{
		dbConnection();
		System.out.println("Inside init()");
	}
    public void dbConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established");
	}


	public void closeConnection() throws SQLException {
		System.out.println("connection closed");
	}

	@PreDestroy
	public void destroy() throws SQLException {
		closeConnection();
		System.out.println("destroy()");

	}

	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public void fetchData() throws SQLException, ClassNotFoundException {
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
	}
	public void deleteRecord(int sid) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		con=DriverManager.getConnection(url, user, pass);
		System.out.println("Connection established");
		Statement stmt=con.createStatement();
		stmt.executeUpdate("delete from StudentInfo where Student_ID= "+sid);
		System.out.println("deleted Record = "+sid);
	}

}
