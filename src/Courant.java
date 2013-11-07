
public class Courant extends Compte{
	private double decouvert;
	
	public Courant(){
		super();
		decouvert = 0;
	}
	
	public Courant(Client leClient, int numero, int solde, double unDecouvert){
		super(leClient, numero, solde);
		decouvert = unDecouvert;
	}
	
	public boolean debiteSolde(double unSolde){
		this.setSolde(getSolde() - unSolde);
		if (this.getSolde() >= decouvert) {
			return true;
		}
		else{
			this.setSolde(getSolde() +unSolde);
			return false;
		}
	}
}
