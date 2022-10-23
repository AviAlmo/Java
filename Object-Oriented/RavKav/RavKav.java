
public class RavKav {

	
	private int id;
	double balance = 0;
	private double bonusRate;
	
	public RavKav(int id,  double bonusRate) {
		this.id = id;
		this.bonusRate = bonusRate;
	} 

	public void charge(double amount){
			balance += amount + (amount * bonusRate) ;	
		
	}
	
	public boolean pay(double amount) {
		if(amount < balance) { 
			balance -= amount; 
			return true ; 			
		}else {
			return false;
		}	
	}

	
	public int getId() {
		return id;
	}


	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return String.format("RavKav [id=%5d, balance= %.2f, bonusRate= %.2f]", id, balance, bonusRate);
	}

	
	
	
	
	
	
	
}
