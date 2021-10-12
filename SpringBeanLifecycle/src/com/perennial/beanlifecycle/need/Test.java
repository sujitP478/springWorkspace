package com.perennial.beanlifecycle.need;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		StudentDAO dao=new StudentDAO();
		dao.fetchData();
		dao.deleteRecord(5);
		
	}

}
