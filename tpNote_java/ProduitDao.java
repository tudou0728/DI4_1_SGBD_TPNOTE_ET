package tpNote;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProduitDao 
{
	public void listDesProduits(Connection conn)
	{
		Statement stmt;
		try 
		{
			PreparedStatement st=conn.prepareStatement("select * from produit left join categorie on produit.typeProduit=categorie.idCategorie ;");
			ResultSet rs= st.executeQuery();
			while(rs.next())
			{
				String nom=rs.getString("nomProduit");
				String type=rs.getString("type");
				Integer quantite=rs.getInt("quantite");
				Double prixUnitaire=rs.getDouble("prixUnitaire") * 1.15;
				System.out.println("nom:"+nom+" "+"type: "+type+" "+"quantite: "+quantite+" "+"prixUnitaire: "+prixUnitaire);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Produit selectProduit(String idDeProduit,Connection connection )
	{
		Statement stmt;
		Produit produit=new Produit();
		try 
		{
			PreparedStatement st=connection.prepareStatement("select * from produit left join categorie on produit.typeProduit=categorie.idCategorie where idProduit=?;");
			st.setString(1, idDeProduit);
			ResultSet rs= st.executeQuery();
			while(rs.next())
			{
				String id=rs.getString("idProduit");
				String nom=rs.getString("nomProduit");
				String type=rs.getString("type");
				Integer quantite=rs.getInt("quantite");
				Double prixUnitaire=rs.getDouble("prixUnitaire") * 1.15;
				produit.setNomProduit(nom);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return produit;
	}
}
