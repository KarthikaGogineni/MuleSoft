package movies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class QuerySelectByMovieName {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=DBConnection.getConnection();
			System.out.println("Enter Actor's Name");
			String mname=sc.nextLine();
			String sql="select * from movies where leadactor=?";
		    PreparedStatement ps=con.prepareStatement(sql);
		    ps.setString(1,mname);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println("Record Exists!");
				System.out.println("Id:"+rs.getInt(1));
				System.out.println("Movie Name:"+rs.getString(2));
				System.out.println("Actor's Name:"+rs.getString(3));
				System.out.println("Actress's Name:"+rs.getString(4));
				System.out.println("Year of RElease:"+rs.getInt(5));
				
			}
			else {
				System.out.println("Record Doesn't Exist");
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
}
