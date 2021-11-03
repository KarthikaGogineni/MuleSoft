package movies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertingData {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		try {
			Connection con=DBConnection.getConnection();
			System.out.println("Connection Established");
			String sql="insert into movies(moviename,leadactor"
					+ ",leadactress,yearofrelease) values(?,?,?,?)";
			PreparedStatement pst=con.prepareStatement(sql);
			System.out.println("Enter Movie Name:");
			String mname=sc.nextLine();
			pst.setString(1,mname);
			System.out.println("Enter Actors Name:");
			String actor=sc.nextLine();
			pst.setString(2,actor);
			System.out.println("Enter Actress Name:");
			String actress=sc.nextLine();
			pst.setString(3,actress);
			System.out.println("Enter Year of Release:");
			int year=sc.nextInt();
			pst.setInt(4,year);
			pst.executeUpdate();
			System.out.println("Inserted Successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		sc.close();
	}
	
}
