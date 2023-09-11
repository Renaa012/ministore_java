package database;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
public class KetNoiDB {
	public static java.sql.Connection getConnection() {
		java.sql.Connection c = null;
		try {
			// Dang ky MySQL Driver voi DriverManager
			//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//Cac thong so
			String url = "jdbc:mysql://localhost:3306/ministore";
			String userName = "root";
			String password = "";
			//Tao ket noi 
			c = DriverManager.getConnection(url, userName, password);
                        System.out.println("connect database");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return c;
	}
	public static void closeConnection(java.sql.Connection c) {
		try {
			if(c!=null) {
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void printInfo(java.sql.Connection c) {
		try {
			if (c != null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			} 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
