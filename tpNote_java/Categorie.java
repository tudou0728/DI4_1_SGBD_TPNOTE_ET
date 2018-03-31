package tpNote;

public class Categorie 
{
	
	private String IdCategorie;
	private String Nom;
	
	public Categorie(String idCategorie, String nom) 
	{
		IdCategorie = idCategorie;
		Nom = nom;
	}
	
	public String GetIdCategorie()
	{
		return IdCategorie;
	}
	
	public String GetNom() 
	{
		return Nom;
	}
}
