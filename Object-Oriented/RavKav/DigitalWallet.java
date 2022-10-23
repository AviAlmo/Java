import java.util.ArrayList;

public class DigitalWallet {

	private ArrayList<RavKav> cards = new ArrayList<RavKav>();
		
	public void addCard(RavKav card)	{
		cards.add(card);
	}
		
	public RavKav find(int id) {
		for(RavKav a: cards){			
			 if(a.getId() == id) {
				 return a ; 
			 }
		}			 
		return null;
	}	

	public boolean charge(int id, double amount) {
	RavKav card = find(id);
	if ( card != null) { 
		card.charge(amount);
		return true;
		
	}else {
		System.out.print("Error: card -1 not found");
		return false;
	}
}

	public boolean pay(int id, double amount){
		RavKav idKav =find(id) ; 
		if (idKav != null ){
			boolean resulte = idKav.pay(amount) ; 
			if (resulte == true){
				return  resulte ;		
			}else{
				System.out.printf("Error: the balance of card %d is too low" , idKav.getId()); 
				return false;		
			}	
			}else{
				System.out.println("Error: card -1 not found"); 
				return false ;	
		}
	}
	
	public double getTotalBalance(){
		double TotalBalance = 0; 
		for (RavKav aKav : cards) {
			TotalBalance += aKav.getBalance();
			
		}
		return TotalBalance; 
	}
	
	@Override
	public String toString(){	
		String msg ="" ; 
		msg += String.format("DigitalWallet \n");
		for(RavKav a: cards){			
			msg += a.toString() +"\n";
		}
		msg += String.format("Total balance:  %.2f \n" , getTotalBalance());
		return msg ; 
	}
	
	

}