
public class Compte {
	private Client leClient;
	private int numero;
	private double solde;
	
	public Compte(){
		leClient = new Client();
		numero = 0;
		solde = 0;
	}
	
	public Compte(Client unClient, int unNum, int unSolde){
		leClient = unClient;
		numero = unNum;
		solde = unSolde;
	}
	
	public void crediteSolde(double unSolde){
		solde+=unSolde;
	}
	
	public boolean debiteSolde(double unSolde){
		solde-=unSolde;
		return true;
	}
	
	public double getSolde(){
		return solde;
	}
	
	public boolean transfert(Compte unCompte){
		double res = unCompte.getSolde();
		this.debiteSolde(res);
		unCompte.crediteSolde(res);
		return true;
	}
}
