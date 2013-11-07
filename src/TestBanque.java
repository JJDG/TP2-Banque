import java.util.ArrayList;


public class TestBanque {

	public static void main(String[] args) {
		Banque banque = new Banque();
		Client jean = new Client("jean", "gabin");
		banque.ajouteClient(jean);
		Client joh = new Client("johan", "guicheron");
		banque.ajouteClient(joh);
		Client joss = new Client("josselin", "damex");
		banque.ajouteClient(joss);
		Compte co1 = new Compte();
		Courant co2 = new Courant(joss, 1, 1500, -10);
		joh.ajoutCompte(co1);
		joss.ajoutCompte(co2);
		
		
		System.out.println(banque);
	}

}
