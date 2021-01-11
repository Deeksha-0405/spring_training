package com.zensar.Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	
	public static Connection getConnection() {
		
		String driverClassName="com.mysql.jdbc.Driver";
		String Url="jdbc:mysql://localhost:3306/baby";
		String dbUserName="root";
		String dbPassword="root";
		Connection con=null;
		try {
			Class.forName(driverClassName);
			con=DriverManager.getConnection(Url, dbUserName,dbPassword);	
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		return con;
	}

}
