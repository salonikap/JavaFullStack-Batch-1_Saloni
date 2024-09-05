package com.verizon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcDemo {
public static void main(String[] args)throws ClassNotFoundException,SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","verizon");
	System.out.println("Connection successful");
	Statement st=con.createStatement();
	PreparedStatement pst=con.prepareStatement("insert into plan values(?,?)");
	System.out.println("enter 3 plan recors,id,name");
	Scanner sc=new Scanner(System.in);
	for(int i=1;i<=3;i++)
	{

		pst.setInt(1,sc.nextInt());
		pst.setString(2,sc.next());
		pst.execute();
		
	}
	ResultSet rs=st.executeQuery("select* from plan");
	ResultSetMetaData rsmd=rs.getMetaData(); 
	System.out.println(rsmd.getColumnCount());
	for(int i=1;i<=rsmd.getColumnCount();i++) {
		System.out.print(rsmd.getColumnName(i)+" ");
	}
	System.out.println();
	System.out.println("----------------------");
	while(rs.next())
	{
		System.out.println(rs.getString(1)+" "+rs.getString(2));
	}
	
	//update
	PreparedStatement pst1=con.prepareStatement("update plan set name=? where pid=?");
	System.out.println("enter id for which name to update");
	Scanner sc1=new Scanner(System.in);
	int id=sc1.nextInt();
	String newName=sc.next();
	pst1.setString(1, newName);
	pst1.setInt(2,id);
	pst.execute();
	System.out.println("after update");
	
	//delete
	PreparedStatement pst2=con.prepareStatement("delete from plan where pid=?");
	System.out.println("enter id delete");
	int id1=sc1.nextInt();
	pst1.setInt(1,id1);
	pst.execute();
	System.out.println("after delete");
	
	
	PreparedStatement pst3=con.prepareStatement("select * from plan where pid<?");
	System.out.println("enter id to be displayed");
	int id2=sc1.nextInt();
	pst1.setInt(1,id2);
	ResultSet rs1=pst1.executeQuery();
	System.out.println(".............");
	while(rs1.next()) {
		System.out.println(rs1.getString(1)+" "+rs1.getString(2));
	}
}

}
