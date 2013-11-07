import java.util.ArrayList;


public class Banque {
	private ArrayList<Client> lesClient;
	
	public Banque(){
		lesClient = new ArrayList<Client>();
	}
	
	public Client richeClient(){
		Client res = null;
		for(Client c : lesClient){
			if(c.soldeGeneral() > res.soldeGeneral()){
				
			}
				

		}
		return res;
	}
}
