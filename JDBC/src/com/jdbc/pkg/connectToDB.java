package com.jdbc.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectToDB {
	public static void main(String[]arg) {
		connectToDB contdb=new connectToDB();
		contdb.toDB();
		contdb.fromDB();
		
	}
	public void toDB() {
		try {
			//1.to load driver class,it is a software establishes connectivity JAVA and DBMS
			Class.forName("org.postgresql.Driver");
			//2.to connect to db using url,un&password
			Connection con =DriverManager.getConnection("jdbc:postgresql://localhost:5432/natarajandb","postgres","1234");
			//3.to prepare query
			Statement stm=con.createStatement();
			//4.executing query
			//using scanner class
			//Scanner sc = new Scanner(System.in);
			//int id=sc.nextInt();
			//String name=sc.next();
			 int id = 3;
			   String name = "ara";
			   stm.executeUpdate("insert into product values(" + id + ",'" + name + "');");
			//stm.executeUpdate("insert into product values(2,'saravana')");
			//5.close&connect
			stm.close();
			con.close();
			System.out.println("successfully inserted!");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void fromDB() {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/natarajandb","postgres","1234");
			Statement stm = con.createStatement();
			int id =1;
//			ResultSet rs = stm.executeQuery("select*from product");
			ResultSet rs = stm.executeQuery("select*from product where id="+id);//to view the single id product name 

			
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
			}
			rs.close();
			stm.close();
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
			}
		}

}
