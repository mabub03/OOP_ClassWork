package com.asc.oop.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.asc.oop.util.OurSqlConnector;

public class StartDbExProgram {
	public static void main(String[] args) throws SQLException {
		System.out.println("No Conn yet!");
		Connection ourConn = OurSqlConnector.getLiveWire();
		System.out.println("I'm alive! LiveWire!");
	}
}
