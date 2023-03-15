package wangchengtao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class JDBCUtils {
	static{
		//1.加载JDBC驱动程序
		Driver driver;
		try {
			driver = new Driver();
			DriverManager.registerDriver(driver);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		//2.创建数据库连接
		java.sql.Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test2204","root","123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void close(Connection conn,Statement stmt,ResultSet rs){
		//6.释放资源
		try {
			if(rs!=null)rs.close();
			if(stmt!=null)((ResultSet) stmt).close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
	public static void close(Connection conn,Statement stmt){
		//6.释放资源
		try {
			if(stmt!=null)((ResultSet) stmt).close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return;
	}
}
