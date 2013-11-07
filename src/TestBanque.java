import java.util.ArrayList;


public class TestBanque {

	public static void main(String[] args) {
		Banque banque = new Banque();
		Client jean = new Client("jean", "gabin");
		banque.ajouteClient(jean);
		Client johan = new Client("johan", "guicheron");
		banque.ajouteClient(johan);
		Client josselin = new Client("josselin", "damex");
		banque.ajouteClient(josselin);
		
		
		System.out.println(banque);
	}

}
