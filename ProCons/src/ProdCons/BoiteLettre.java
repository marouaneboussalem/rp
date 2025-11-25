package ProdCons;

public class BoiteLettre {
	
	private boolean plein=false;
	private Lettre lettre;
	
	
	public synchronized void deposer(Lettre lettre) throws InterruptedException {
		
		
		while(plein)
		{
			wait();
		}
		
		this.lettre=lettre;
		System.out.println(lettre.getProducteur()+" depose une lettre pour "+
		        lettre.getConsommateur()+" :\" "+lettre.getContenu()+" \"");
		
		
		plein=true;
		notifyAll();
		
	}
	
	
	
	public synchronized  void retirer(String nomConsommateur) throws InterruptedException {
		
		while(!plein || !lettre.getConsommateur().equals(nomConsommateur)) {
			wait();
		}
		
		System.out.println(lettre.getConsommateur()+" lit la lettre de "+
		      lettre.getProducteur()+" :\" "+lettre.getContenu()+" \" \n ====================");
		
		
		plein=false;
		notifyAll();
		
		
		
	}

}
