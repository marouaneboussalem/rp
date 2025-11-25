package st;

public class Bus extends Thread {
	private int id;
	private Station s;
	private int heureArrivee;
	public Bus(int id, Station s, int heureArrivee) {
		super();
		this.id = id;
		this.s = s;
		this.heureArrivee = heureArrivee;
	}
	@Override
	public void run() {
		try {
			sleep(heureArrivee);
			System.out.println("🚌 Le bus est arrivé à la station");
			s.chargerUsagers();
			System.out.println("🚌 Le bus quitte la station");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	
}
