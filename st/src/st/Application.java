package st;

public class Application {

	public static void main(String[] args) {
		Station gare = new Station("tilila");
		Bus b = new Bus(1,gare, 3000);
		Usager u [] = {
				new Usager ("Ahmed", 1500, gare),
				new Usager ("Othmanr", 2000, gare),
				new Usager ("Ali", 3000, gare),
				new Usager ("Hassan", 3500, gare)
				
		};
		
		b.start();
		
		for (Usager usager : u) {
			usager.start();
		}
	}

}
