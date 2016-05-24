import java.sql.*;

public class myDB {
	private static Connection connection;
	public static final String MYSQL_USERNAME = "root";
	public static final String MYSQL_PASSWORD = "9999";
	public static final String MYSQL_DATABASE_SERVER = "jdbc:mysql://127.0.0.1:3306";
	public static final String MYSQL_DATABASE_NAME = "homework5";

	public myDB() {
		try {
			connection = DriverManager.getConnection(
					MYSQL_DATABASE_SERVER + '/' + MYSQL_DATABASE_NAME, MYSQL_USERNAME,
					MYSQL_PASSWORD);
			if (connection == null) {
				System.out.println("Invalid Info");
			}
		} catch (Exception e) {
			System.err.println("Connection Could Not Be Established");
		}

	}
	public Connection getConnection(){
		return connection;
	}

}
