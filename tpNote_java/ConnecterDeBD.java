package tpNote;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnecterDeBD 
{
	private Connection connection;
	
	public Connection connectToBD()
	{
		Connection conn=null;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/tpnote", "root", "");//allowMultiQueries=yes
			System.out.println("connect dataBase reussir!!!");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
	
	public void closeDataBase(Connection conn) 
	{
		if(conn != null)
		{
			try 
			{
				conn.close();				
			}
			catch(SQLException ex3) 
			{
				System.out.println("Erreur3: "+ex3);
				System.exit(1);
			}
		}
	}
}
