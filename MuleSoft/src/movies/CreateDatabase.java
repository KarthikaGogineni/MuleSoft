package movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CreateDatabase {

	public static void main(String args[]) {
	
	try {
		String DriverClass="com.mysql.jdbc.Driver";
		Class.forName(DriverClass);
		System.out.print("Driver Class Loaded");
		String DBURL="jdbc:mysql://localhost:3306/";
		String username="root";
		String password="girlonfire";
	  Connection connection = DriverManager
	 .getConnection(DBURL,username,password);
	  System.out.println("Connection Established");
	  Statement st=connection.createStatement();
	  String DBName="moviesinfo";
	  String sql="create database "+DBName;
      st.execute(sql);
      ResultSet rs=connection.getMetaData().getCatalogs();
      String db;
      List<String> l=new ArrayList<String>();
      while(rs.next()) {
    	 db=rs.getString(1);
    	 l.add(db);
      }
      if(l.contains(DBName)) {

    	 System.out.println("Database Created Successfully");
      }
     else {
    	 System.out.println("Database Not Created");
      }
      
      
	  
	}
	catch(Exception e) {
		System.out.println(e);
		}
}
}

