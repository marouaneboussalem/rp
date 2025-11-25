package st;

public class Station {
	private String nom;
	private int passagerEnAttente =0;
	private boolean busPresent = false;
	
	
	
	
	public Station(String nom) {
		this.nom = nom;
	}

	synchronized void attendreBus() {
		
			try {
				passagerEnAttente++;
				System.out.println(Thread.currentThread().getName()+ " attend le bus");
				while(!busPresent) {wait();}
				System.out.println(Thread.currentThread().getName()+ " monte dans le bus");
				passagerEnAttente--;
				if (passagerEnAttente == 0) {notify();}
			} catch (InterruptedException e) {e.printStackTrace();}
	}

	synchronized void chargerUsagers() throws InterruptedException {
			busPresent = true;
			System.out.println("🚌 Le bus ouvre ses portes");
			notifyAll();
			
			while(passagerEnAttente>0) {
				wait();
			}
			
			busPresent = false;
			System.out.println("Tous les passagers sont montés, le bus peut partir...");
	}
}
