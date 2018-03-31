package tpNote;

public class Fourniture {
	private String IdFournisseur;
	private String IdProduit;
	private double MontantFacture;
	
	Fourniture(String idFournisseur, String idProduit, double montantFact)
	{
		IdFournisseur = idFournisseur;
		IdProduit = idProduit;
		MontantFacture = montantFact;
	}
	
	public String GetIdFournisseur() {
		return IdFournisseur;
	}
	
	public String GetIdProduit() {
		return IdProduit;
	}
	
	public double GetMontantFacture() {
		return MontantFacture;
	}
}
