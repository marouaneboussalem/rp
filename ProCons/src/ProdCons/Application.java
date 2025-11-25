package ProdCons;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		BoiteLettre boiteLettre=new BoiteLettre();
		
		
		Lettre lettreAdnane=new Lettre("Bonjour Hamid, Comment va tn projet \n"
				              + "Bonne journée à toi, On se voit demain. Au revoir!",
				             "Adnane",
				             "Hamid");
		
		Lettre lettreJaafar= new Lettre("Salut Mohamed, as tu recu les fichiers.\n"
				                + " Réunion à 16h! Bon week-end, Merci pour tn aide !", 
								"Jaafar", 
								"Mohamed");
		
		
	
		Producteur p1=new Producteur("Adnane", lettreAdnane, boiteLettre);
		Producteur p2=new Producteur("Jaafar", lettreJaafar, boiteLettre);
		
		Consommateur c1=new Consommateur("Mohamed", boiteLettre);
		Consommateur c2=new Consommateur("Hamid", boiteLettre);
		

		p1.start();
		p2.start();
		c1.start();
		c2.start();
		
	
		p1.join();
		p2.join();
		c1.join();
		c2.join();
		System.out.println("\n================= fin de programme =================");

	}

}
