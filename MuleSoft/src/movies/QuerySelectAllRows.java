package movies;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class QuerySelectAllRows {

	public static void main(String args[]) {
		try {
			Connection con=DBConnection.getConnection();
			Statement st=con.createStatement();
			String sql="select * from movies";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				
				System.out.println("Id:"+rs.getInt(1));
				System.out.println("Movie Name:"+rs.getString(2));
				System.out.println("Actor's Name:"+rs.getString(3));
				System.out.println("Actress's Name:"+rs.getString(4));
				System.out.println("Year of RElease:"+rs.getInt(5));
				
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
