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
				res = c;
			}
		}
		return res;
	}
	
	public void ajouteClient(Client unClient){
		lesClient.add(unClient);
	}
	
	public String toString(){
		String res = "La banque possede ces clients :\n";
		for(Client c : lesClient){
			res+=c.toString();
		}
		return res;
	}
}
