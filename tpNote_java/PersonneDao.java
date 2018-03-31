package tpNote;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PersonneDao 
{
	public boolean verifierUtilisateur(Connection conn)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("votre id£º");
		String id = s.next();
		System.out.println("votre mdp£º");
		String mdp = s.next();
		boolean v=false;
		Statement stmt;
		try 
		{
			PreparedStatement st=conn.prepareStatement("select * from personne where idPersonne=? and motDePasse=?;");//conn.prepareStatement("select * FROM (select emprunts.*, datediff(retours.Date,emprunts.Date) as duree from emprunts LEFT JOIN retours ON emprunts.Associe=retours.Associe and emprunts.Livre=retours.Livre and emprunts.Copie=retours.Copie WHERE emprunts.Associe=?) B WHERE B.duree is not null");
			st.setString(1, id);
			st.setString(2, mdp);
			ResultSet rs= st.executeQuery();
			if(rs.next())
			{
				System.out.println("bon code!!!");
				v=true;
			}
			else
			{
				System.out.println("mdp incorrecte!!!");
				v=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;	
	}
	
}
