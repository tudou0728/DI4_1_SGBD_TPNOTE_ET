package tpNote;

public class Facture {
	private String IdFacture;
	private String IdCommande;
	private String IdClient;
	private String IdFournisseur;
	private String NomClient;
	private String AdresseLivraison;
	
	public Facture(String idFacture,
	 String idCommande,
	 String idClient,
	 String idFournisseur,
	 String nomClient,
	 String adresseLivraison)
	{
		IdFacture = idFacture;
		IdCommande = idCommande;
		IdClient = idClient;
		IdFournisseur = idFournisseur;
		NomClient = nomClient;
		AdresseLivraison = adresseLivraison;
	}
}
