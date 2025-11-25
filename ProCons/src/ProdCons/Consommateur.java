package ProdCons;

public class Consommateur extends Thread {
	
	private String nom;
	private BoiteLettre boiteLettre;
	
	public Consommateur(String nom, BoiteLettre boiteLettre) {
		super(nom);
		this.nom = nom;
		this.boiteLettre = boiteLettre;
	}
	
	@Override
	public void run() {
		
		try {
			Thread.sleep(800);
			boiteLettre.retirer(nom);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	

}
