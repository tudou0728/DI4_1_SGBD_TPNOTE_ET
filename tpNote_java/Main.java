package tpNote;

import java.sql.Connection;

public class Main 
{
	private static ConnecterDeBD connecterDeBD;
	
	public static void main(String[] args) 
	{
		connecterDeBD=new ConnecterDeBD();
		Connection conn=connecterDeBD.connectToBD();
		
		System.out.println("welcome!!!!");
		System.out.println();
		
		PersonneDao personneDao=new PersonneDao();
		boolean v=personneDao.verifierUtilisateur(conn);
		if(v==true)
		{
			
			System.out.println("liste des produits:");
			ProduitDao produitDao=new ProduitDao();
			produitDao.listDesProduits(conn);
		}
		else
		{
			System.out.println("quitter");
		}
		
		connecterDeBD.closeDataBase(conn);
		
	}
}
