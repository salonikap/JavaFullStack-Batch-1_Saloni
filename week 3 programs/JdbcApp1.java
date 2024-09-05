package com.verizon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApp1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		//step1
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","verizon");
		System.out.println("Connection successful");
		Statement st=con.createStatement();
		//Creating table
		//dml,ddl
		//st.executeUpdate("create table plan(pid number primary key,name varchar(20))" );
		//System.out.println("table created");
		//inserting 
/*
		st.executeUpdate("insert into plan values(1,'friend')");
		st.executeUpdate("insert into plan values(2,'family')");
		st.executeUpdate("insert into plan values(3,'team')");
		
		//updation
		/*
		st.execute("update plan set name='orgplan' where pid=3");
		System.out.println("done");*/
		
		ResultSet rs=st.executeQuery("select * from plan where pid<=3");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
	}

}
