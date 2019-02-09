package com.parul;

import java.sql.*;

public class JdbcConnection
{

	public static void main(String[] args) throws Exception
	{
		//Register Jdbc
//		Class.forName("oracle.jdbc.driver.orableDriver");
		
		//Establish the connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		if(con==null)
		{
			System.out.println("Not Connected");
		}
		else
		{
			System.out.println("Connected");			
		}

	}
}
