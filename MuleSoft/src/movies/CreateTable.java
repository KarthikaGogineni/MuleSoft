package movies;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {
		
		try {
		Connection con=DBConnection.getConnection();
		System.out.println("Connection Established");
		Statement st=con.createStatement();
		String sql="create table movies(id int primary key not null auto_increment"
				 +",moviename varchar(50) not null,leadactor varchar(50) not null"
				+",leadactress varchar(50) not null,yearofrelease int not null)";
		
		  st.execute(sql);
ResultSet rs = con.getMetaData().getTables(null, null, "movies", null);
	      if(rs.next()) {

	    	 System.out.println("Table Created Successfully");
	      }
	     else {
	    	 System.out.println("Table Not Created");
	      }
	      
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
