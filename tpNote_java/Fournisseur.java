package tpNote;

public class Fournisseur extends Personne {
	
	public Fournisseur(String id, String nom, String prenom, String adresse, String ville, String password) 
	{
		setIdPersonne(id);
		setNom(nom);
		setPrenom(prenom);
		setAdresse(adresse);
		setVille(ville);
		setMotDePasse(password);
	}
}
