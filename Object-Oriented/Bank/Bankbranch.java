/*
 * אבשלום אלמו - 313233827
 * אלון גלאי - 203204029 
 */
import java.util.ArrayList;

public class Bankbranch {
 
	private String branchNumber; 
	private String branchAdress; 
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>(); 
	
	double amount = 0 ; 
	double sum = 0 ; 

	public Bankbranch(String branchNumber,String branchAdress) {
	this.branchNumber = branchNumber;
	this.branchAdress = branchAdress;
	} 
	
	public void addAccount(BankAccount account){
		accounts.add(account);
	}
	
	public BankAccount findAccount(String accountNumber){
	   for(BankAccount account: accounts){
		if(accountNumber.equals(account.getaccountNumber())){
	        return account;
	        
	      }		
	   }
	   
	   return null;
	   
	}
	
	public boolean deposit(String accountNumber, double amount) {
		BankAccount x = findAccount(accountNumber); 
		if(x != null){
			return	x.deposit(amount);
		}else{
			   return false;
		}
	}
	
	public boolean withdraw(String accountNumber, double amount) {
		BankAccount x = findAccount(accountNumber); 
		if(x != null ){
			return x.withdraw(amount); 
		}else{
			   return false;
	}	
   }
	
	public boolean transfer(String fromAccountNumber, String toAccountNumber, double amount){
		BankAccount From = findAccount(fromAccountNumber); 
		BankAccount To = findAccount(toAccountNumber); 
		
		boolean msg ;
		if (From != null && To != null) {
			msg = From.withdraw(amount); 
			if(msg == true){
				return To.deposit(amount);
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}

	@Override
	public String toString() {
		String msg = "" ; 
		msg += "------------------------------------- \n";
		msg += String.format("Bankbranch :  \n branch Number =%s \n branch Adress = %s  \n", branchNumber, branchAdress);
		msg += "-------------------------------------";
		
		double total = 0;
		for(BankAccount a: accounts)
		{
			msg += a.toString() +"\n";
			total += a.getBalance();
		}
		
		msg +="-------------------------------------\n";
		msg += String.format(" Number of accounts : %s \n Total balance : %.2f \n", accounts.size(), total);
		msg +="-------------------------------------";
		return msg;

	}
	
	public String accountsInDebt(){
		String msg = "" ; 
		double total = 0;
		
		msg += "-------------------------------------\n";
		msg += String.format("Bankbranch : \n branch Number =%s \n branch Adress = %s  \n", branchNumber, branchAdress);
		msg += "-------------------------------------\n";
		
		for(int i = 0; i < accounts.size(); i++) {
			BankAccount currentAccount = accounts.get(i);
			if (currentAccount.getBalance() < 0){	
				msg += currentAccount.toString() +"\n";
				total -= currentAccount.getBalance();
			}
		}
		
		msg +="-------------------------------------\n";
		
		return msg;	
	
	}
}

	

