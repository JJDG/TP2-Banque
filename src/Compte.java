
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
	
	public Client getClient(){
		return leClient;
	}
	
	public void setClient(Client unClient){
		leClient = unClient;
	}
	
	public double getSolde(){
		return solde;
	}
	
	public void setSolde(double unSolde){
		solde = unSolde;
	}
	
	public void setNumero(int unNum){
		numero = unNum;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public boolean transfert(Compte unCompte){
		double res = unCompte.getSolde();
		this.debiteSolde(res);
		unCompte.crediteSolde(res);
		return true;
	}
	
	public boolean comparer(Compte unCompte){
		if(this.getSolde() > unCompte.getSolde()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		String res = "";
		res = leClient.getNom()+" "+leClient.getPrenom()+" compte numero : "+numero+" solde : "+solde+" ";
		return res;
	}
}
