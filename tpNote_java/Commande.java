package tpNote;

public class Commande {
	
	private String IdCommande;
	private String IdProduit;
	private String IdFournisseur;
	private String IdClient;
	private  int Quantite;
	private double Montant;
	
	public Commande(String idCommande, String idProduit, String idFournisseur, String idClient, int quantite, double montant) {
		IdCommande = idCommande;
		IdProduit = idProduit;
		IdFournisseur = idFournisseur;
		IdClient = idClient;
		Quantite = quantite;
		Montant = montant;
	}
	
	public String GetIdCommande() {
		return IdCommande;
	}
	
	public String GetIdProduit() {
		return IdProduit;
	}
	
	public String GetIdFournisseur() {
		return IdFournisseur;
	}
	
	public String GetIdClient() {
		return IdClient;
	}
	
	public int GetQuantite() {
		return Quantite;
	}
	
	public double GetMontant() {
		return Montant;
	}
}
