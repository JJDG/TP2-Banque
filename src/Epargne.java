
public class Epargne extends Compte{
	private double taux;
	
	public Epargne(){
		super();
		taux = 0;
	}
	
	public Epargne(Client leClient, int numero, int solde, double unTaux){
		super(leClient, numero, solde);
		taux = unTaux;
	}
}
