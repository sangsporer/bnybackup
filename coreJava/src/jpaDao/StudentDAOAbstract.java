package jpaDao;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.net.aso.e;



public abstract class StudentDAOAbstract {
	
	private final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	private final String username ="sang1";
	private final String password ="Pass123";
	private final Driver driver = new oracle.jdbc.driver.OracleDriver();
	
	protected Connection conn = null;
	protected PreparedStatement ps = null;
    protected ResultSet rs = null;
    
   
	public StudentDAOAbstract() {
		// TODO Auto-generated constructor stub
	}
	
	public void connect() throws SQLException {
		try {
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, password);
			
		}catch (SQLException e) {
			// TODO: handle exception
			throw new SQLException ();
		}
		
	}
	
	public void dispose() {
		try {
			if(!rs.equals(null)) {
				if(!rs.isClosed()) rs.close();
			}
			if(!ps.equals(null)) {
				if(ps.isClosed()) ps.close();
			}
			if(!conn.equals(null)) {
				if(!conn.isClosed()) conn.close();
			}
		} catch (SQLException e) {}
	}

}
