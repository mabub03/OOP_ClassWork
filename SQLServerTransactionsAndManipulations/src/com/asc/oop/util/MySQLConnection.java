package com.asc.oop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MySQLConnection {
	private static LogManager lMngr = LogManager.getLogManager();
	private static Logger log = lMngr.getLogger(Logger.GLOBAL_LOGGER_NAME);
	private static OOPLogger obj = new OOPLogger();
	

	private static Connection cn 		= 	null;
	private static Properties cProp 	=	null;
	private static PreparedStatement PS	=	null;

	private MySQLConnection(){
		try {
			Class.forName("org.mysql.Driver");
			cProp 	= getMySQLCreds();
			cn 		= setConnection();
			PS 		= setPs();
		}catch(ClassNotFoundException e) {
			
			log.log(Level.SEVERE, e.toString());
		}
		
	}

	private static final String UN = "JDBCExApp";
	private static final String PASS = "P@$$w0rd1";
	private static final String MYDBMS = "jdbc:mysql://localhost:3306/";
	
	private static PreparedStatement setPs() {
		try {
			PreparedStatement ps = (PreparedStatement) cn.createStatement();
			
			return ps;
		}catch(SQLException ex) {
			log.log(Level.SEVERE, ex.toString());
		}
		return null;
	}
	private static Connection setConnection(){
		obj.makeAnInfoLog("Welcome to the DB Example App");
		obj.makeAnInfoLog("The first thing we must do, is create one of the following: DriverManager or Datasource.");
		obj.makeAnInfoLog("One of these classes are needed in order to pass the DB's Creds to the Connection class (.getConnection())");
		// @NOTE: If your mySQL server instance is a "fresh" installation, it is highly probable that there is only ONE USER created for Auth (root).
		//Please realize the 'root' user should NEVER BE USED  on a third party that is changing data. A new user should be created on the SQL server
		// and given ONLY the authority that is needed in order to fullfil duties of that particular application/program. 
		// -- When the user is setup on the SQL Server, "expire Password" or equivalent should NEVER BE IMPLEMENTED.
	
		// The DriverManger class is called to populate your Connection Obj
		Connection conn = null;
		//This is optional, showing because you can create a ".properties" file associated with the proj, and use this Class
		try {
		//Lets populate Connection w/Drivermgr
		conn = DriverManager.getConnection(getMydbms(),cProp);
		
		log.log(Level.INFO,"Connection Created!");
		}catch(SQLException eSql) {
			log.log(Level.SEVERE,null,eSql);
		}
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
	
	private static Properties getMySQLCreds() {
		Properties cProp = new Properties();
		log.log(Level.INFO, "setting the Properties for our MySQL DM");
		cProp.put("user", getUn());
		log.log(Level.CONFIG,"user:"+getUn());
		cProp.put("password", getPass());
		log.log(Level.CONFIG,"user:"+getPass());
		return cProp;
	}
	
	private static class MySQLConManger{
		private final static MySQLConnection instance = new MySQLConnection();
	}
	
	public static MySQLConnection getInstance() {
		try {
			return MySQLConManger.instance;
		}catch(ExceptionInInitializerError ex) {
			log.log(Level.SEVERE,ex.toString());
		}
		return null;
	}
	
	public static Connection getConnection() {
		return cn;
	}
	
	public static PreparedStatement getPreparedStmt() {
		return PS;
	}
	
	public static void killKillKill() {
		// The method that closes everything so that we don't create memory leaks
		try {
			PS.close();
			cn.close();
			log.log(Level.INFO, "Our connections are now closed.");
		} catch(SQLException ex) {
			log.log(Level.SEVERE,ex.toString());
		}
	}
}
