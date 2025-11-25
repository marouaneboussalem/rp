package ProdCons;

public class Producteur extends Thread {

	private String nom;
	private BoiteLettre boiteLettre;
	private Lettre lettre;
	
	public Producteur(String nom,Lettre lettre,  BoiteLettre boiteLettre) {
		super(nom);
		this.nom = nom;
		this.boiteLettre = boiteLettre;
		this.lettre = lettre;
	}
	
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(2000); 
			boiteLettre.deposer(lettre);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
