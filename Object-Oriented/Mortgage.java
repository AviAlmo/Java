import java.util.Scanner;

import java.util.ArrayList;
import java.util.Iterator;

public class Mortgage {

	public static void main(String[] args) { 
		
		Scanner inScanner= new Scanner(System.in);
		
		System.out.print("Please enter the mortgage amount :");
		double amount = inScanner.nextDouble();
		
		System.out.print("Please enter the annual interest rate (in %) : ");
		double rate = inScanner.nextDouble() /100 / 12;
		
		System.out.print("Please enter the number of years : ");
		int year = inScanner.nextInt() * 12;
		
		double[] mortgageBalance= new double[year +1] ;

		double MonthlyPymant = amount *rate / (1-(Math.pow((1 +rate), -year))) ; 
		
		System.out.printf("The monthly paymant : %.2f \n",MonthlyPymant);
		System.out.print("-------------------------------------------\n");
		System.out.print("Mortgage repayments schedule \n");
		System.out.print("------------------------------------------- \n");
		System.out.print("Month               |   Mortgage balance \n"); 
		System.out.print("------------------------------------------- \n");
		mortgageBalance[0] =  amount ;
		System.out.printf(" %5d              |        %.2f \n" , 0, mortgageBalance[0] );
		for (int i = 1; i < mortgageBalance.length; i++) {
			mortgageBalance[i] = (mortgageBalance[i-1] + (mortgageBalance[i-1] *rate )) - MonthlyPymant ;
			System.out.printf(" %5d              |        %.2f \n" , i , mortgageBalance[i] );

		}
		System.out.print("------------------------------------------- \n");
		System.out.printf("Total amount paid        |  %.2f \n" , MonthlyPymant * year); 
		System.out.printf("Total interest paid      |  %.2f \n" , (MonthlyPymant * year) - amount); 

		
	}

}
