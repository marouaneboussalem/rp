package ProdCons;

public class Lettre {
	private String contenu;
	private String producteur;
	private String consommateur;
	public Lettre(String contenu, String producteur, String consommateur) {
		super();
		this.contenu = contenu;
		this.producteur = producteur;
		this.consommateur = consommateur;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public String getProducteur() {
		return producteur;
	}
	public void setProducteur(String producteur) {
		this.producteur = producteur;
	}
	public String getConsommateur() {
		return consommateur;
	}
	public void setConsommateur(String consommateur) {
		this.consommateur = consommateur;
	}
	
	

}
