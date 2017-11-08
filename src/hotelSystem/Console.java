package hotelSystem;

import java.sql.*;

import javax.swing.JFrame;

import java.io.File;

public class Console {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(1,2);
		String dbName = "BLOP.db"; //what the database is called
		
		/** if the program is being run for the first time the database will be built
		 * 
		 */
		File file = new File("db/"+dbName);
		Boolean initialRun = !file.exists();	
		if(initialRun) {
			Database.build(dbName);
		}
		else {
			connect(dbName);
		}
		
		//first action when program is run:
		LoginPage.run();
		
	}
	//connects to database.
	private static Connection connect(String name) {
		String dbLoc = "jdbc:sqlite:db/"+name;
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(dbLoc);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
}
	
	
		
	