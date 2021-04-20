package com.asc.oop.util;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudExecutions {
	private CrudExecutions() {
		Conn = MySQLConnection.getInstance();
	}
	
	private static CrudExecutions INST;
	
	private static MySQLConnection Conn;
	
	public static CrudExecutions getInstance() {
		if(INST == null) {
			synchronized (CrudExecutions.class) {
				INST = new CrudExecutions();
			}
		}
		return INST;
	}
	
	public static ResultSet getData(String sql) {
		PreparedStatement ps = Conn.getPreparedStmt();
		ps.executeQuery(sql);
	}
}
