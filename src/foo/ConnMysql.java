/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author doquy
 */
public class ConnMysql {
	public static Connection openConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/db_qltv";
		String username = "root";
		String password = "";
		Connection conn =	(Connection) DriverManager.getConnection(url, username, password);
		return conn;
	}
}
