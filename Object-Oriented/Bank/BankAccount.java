
public class BankAccount {
	
	private final  String  accountNumber ;
	private String customerName ;
	private double balance ;
	private double min_Balance ;
	private double transactionFee ;
	double Sum = 0;
	
	public BankAccount(String accountNumber,String customerName, double balance, double min_Balance, double transactionFee) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.min_Balance = min_Balance;
		this.transactionFee = transactionFee;
	}
	
	public boolean deposit(double Transfer) {
			balance += (Transfer - transactionFee);	
			return true;
		}
	
	public boolean withdraw(double Transfer) { 
		Sum = Transfer + transactionFee;
		if (balance > Sum ) {
			balance -= Sum;
			return true;
		}else {
			return false; 
		}
		
	}
	
	public String getaccountNumber() {
		return accountNumber ;
	}
	
	public double getBalance() {
		return balance ;
	}
	
	public String toString() {
		return String.format(" \n BankAccount : \n account Number =%.5s \n customer Name =%.5s \n balance = %5.2f \n Min balance account = %5.2f \n transaction Fee = %5.2f \n"
							,accountNumber, customerName, balance ,min_Balance, transactionFee);

	}
	
}
	
	
	
	
	


