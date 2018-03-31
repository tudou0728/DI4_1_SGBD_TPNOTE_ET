package tpNote;

public class Client extends Personne {
	
	public Client(String id, String nom, String prenom, String adresse, String ville, String password) 
	{
		setIdPersonne(id);
		setNom(nom);
		setPrenom(prenom);
		setAdresse(adresse);
		setVille(ville);
		setMotDePasse(password);
	}
}
