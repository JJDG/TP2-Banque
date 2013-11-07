
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
	
	public boolean debiteSolde(double unSolde){
		if (unSolde >= 0) {
			this.setSolde(getSolde() - unSolde);
			return true;
		}
		else{
			return false;
		}
	}
	
	public double getSolde(){
		double resSolde = super.getSolde();
		resSolde*=taux;
		return resSolde;
		
	}
}
