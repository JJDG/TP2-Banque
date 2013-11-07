import java.util.ArrayList;

public class Client {
	private ArrayList<Compte> lesCompte;
	private String prenom, nom;
	
	public Client(){
		lesCompte = new ArrayList<Compte>();
		nom = "inconnu";
		prenom = "inconnu";
	}
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public void setNom(String unNom){
		nom = unNom;
	}
	
	public void setPrenom(String unPrenom){
		prenom = unPrenom;
	}
	
	public double soldeGeneral(){
		double res = 0;
		for(Compte c : lesCompte){
			res+= c.getSolde();
		}
		return res;
	}
	
	public void ajoutCompte(Compte unCompte){
		lesCompte.add(unCompte);
	}
	
	public boolean compteRouge(){
		for(Compte c : lesCompte){
			if(c.getSolde() < 0){
				return true;
			}
		}
		return false;
	}
	
	public String toString(){
		String res = "";
		res += "";
		return res;
	}
}
