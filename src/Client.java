import java.util.ArrayList;

public class Client {
	private ArrayList<Compte> lesCompte;
	private String prenom, nom;
	
	public Client(){
		lesCompte = new ArrayList<Compte>();
		nom = "inconnu";
		prenom = "inconnu";
	}
	
	public double soldeGeneral(){
		double res = 0;
		return res;
	}
	
	public void ajoutCompte(Compte unCompte){
		lesCompte.add(unCompte);
	}
}
