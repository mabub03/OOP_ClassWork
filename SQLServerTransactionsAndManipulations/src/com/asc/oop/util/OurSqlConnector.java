package com.asc.oop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OurSqlConnector {
	private static final String UN = "JDBCExApp";
	private static final String PASS = "P@$$w0rd1";
	private static final String MYDBMS = "jdbc:mysql://localhost:3306/";
	
	public static Connection getLiveWire() throws SQLException {
		System.out.println("Welcome to the DB Example App");
		System.out.println("The first thing we must do, is create one of the following: DriverManager or Datasource.");
		System.out.println("One of these classes are needed in order to pass the DB's Creds to the Connection class (.getConnection())");
		// @NOTE: If your mySQL server instance is a "fresh" installation, it is highly probable that there is only ONE USER created for Auth (root).
		//Please realize the 'root' user should NEVER BE USED  on a third party that is changing data. A new user should be created on the SQL server
		// and given ONLY the authority that is needed in order to fullfil duties of that particular application/program. 
		// -- When the user is setup on the SQL Server, "expire Password" or equivalent should NEVER BE IMPLEMENTED.
	
		// The DriverManger class is called to populate your Connection Obj
		Connection conn = null;
		//This is optional, showing because you can create a ".properties" file associated with the proj, and use this Class
		Properties cProp = new Properties();
		cProp.put("user", getUn());
		cProp.put("password", getPass());
		
		
		//Lets populate Connection w/Drivermgr
		conn = DriverManager.getConnection(getMydbms(),cProp);
		
		System.out.println("Connection Created!");
		
		return conn;
	}
	
	protected static String getUn() {
		return UN;
	}

	protected static String getPass() {
		return PASS;
	}

	protected static String getMydbms() {
		return MYDBMS;
	}
}
