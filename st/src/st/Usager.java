package st;

public class Usager extends Thread {
	private String nom;
	private int heureArrivee;
	private Station s;

	public Usager(String nom, int heureArrivee, Station s) {
		super(nom);
		this.nom = nom;
		this.heureArrivee = heureArrivee;
		this.s = s;
	}

	@Override
	public void run() {
		try {
			sleep(heureArrivee);
			System.out.println("🚶🏻 " + nom + " est arrivé à la station");
			s.attendreBus();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
