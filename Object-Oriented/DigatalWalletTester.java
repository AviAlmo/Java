
public class DigatalWalletTester {

public static void main(String[] args) {
		
		DigitalWallet myDigitalWallet = new DigitalWallet();
		
		RavKav rk1 = new RavKav(123, 0.25);
		RavKav rk2 = new RavKav(456, 0);
		myDigitalWallet.addCard(rk1);
		myDigitalWallet.addCard(rk2);
		System.out.println("Two cards are added to digital wallet.");
		System.out.println(myDigitalWallet.toString()+ "\n\n");
		
		myDigitalWallet.charge(123, 100);
		myDigitalWallet.charge(456, 100);
		myDigitalWallet.charge(-1, 100);
		System.out.println("Each of the cards is charged by 100 NIS.");
		System.out.println(myDigitalWallet.toString()+ "\n\n");
		
		myDigitalWallet.pay(123, 5);
		System.out.println("5 NIS is payed by card 123");
		System.out.println(myDigitalWallet.toString()+ "\n\n");
		
		System.out.println("Trying to pay 500 NIS by card 123:");
		myDigitalWallet.pay(123, 500);
		
		System.out.println("Trying to pay 5 NIS by unexisting card -1:");
		myDigitalWallet.pay(-1, 5);
		
		
	}

}





