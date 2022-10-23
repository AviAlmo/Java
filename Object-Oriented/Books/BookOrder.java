/*
 * 
 * אבשלום אלמו - 313233827
 */
import java.util.ArrayList;

public class BookOrder {

	 int orderNumver;
	 String date ;
	 private ArrayList<book> books = new ArrayList<book>();
	 
	public BookOrder(int orderNumver, String date) {
		this.orderNumver = orderNumver;
		this.date = date;
	}
	
	public void addbook(book book)	{
		books.add(book);
	}
	
	public double getSubTotal() { 
		double totalBook = 0 ;
		
		for ( book  aBook : books) {
			totalBook +=  aBook.getPrice();		
		}
		return totalBook;
	}
	
	public double getShippingCost() { 
		int count = 0 ; 
		for ( book  books : books) {
			count ++;
		}
		count = count * 15 ; 
		return count;
	}
	
	public double getGrandTotal() { 
		double GrandTotal = 0 ;
		GrandTotal += getShippingCost() + getSubTotal();
		return GrandTotal;
	}

	@Override
	public String toString() {
		String msg = "" ; 
		
		 msg += String.format( " Order : %d      Date: %s \n"  , orderNumver , date); 
		 msg += String.format( "--------------------------------------- \n"  ); 
		 
		for(book a: books){			
			msg += a.toString() +"\n";
		}

		 msg += String.format( "---------------------------------------\n"  ); 
		 msg += String.format( "Sub Total     : %8.2f  \n"  ,getSubTotal()); 
		 msg += String.format( "Shipping Cost : %8.2f \n"  ,getShippingCost()); 
		 msg += String.format( "Grand Total   : %8.2f \n"  , getGrandTotal()); 
		return msg;

	}	
}
