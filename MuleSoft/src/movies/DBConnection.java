package movies;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

			public static String DriverClass="com.mysql.jdbc.Driver";
			public static String DBURL="jdbc:mysql://localhost:3306/moviesinfo";
			public static String username="root";
			public static String password="girlonfire";
			public static Connection con=null;
		  
		    public static Connection getConnection() {
		    	
		    	try {
		    	  con=DriverManager.getConnection(DBURL,username,password);  
		    	}
		    	catch (Exception e) {
		    	    System.out.println(e);
		    	 
		    	}
		    	return con;
		        
		    }
		
	

}
