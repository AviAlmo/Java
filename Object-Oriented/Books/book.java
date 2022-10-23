/*
 * 
 * אבשלום אלמו - 313233827
 */
public class book {

	
	 String title;
	 String author ;
	 int numPages;
	
	public book(String title, String author, int numPages) {
		this.title = title;
		this.author = author;
		this.numPages = numPages;
	}
	
	public double getPrice() { 
		double Price ;
		if (numPages > 500) { 
			Price = 500 * 0.1 + (numPages-500) * 0.04 ; 
		}else {
			Price = numPages * 0.1 ;		
		}
		return Price;		
	}

	@Override
	public String toString() {
		String msg = "" ;
		
		msg += String.format("Book [title=%25s, author=%25s, numPages=%10d, Price= %10.2f]", title, author, numPages,
						getPrice());
		return msg; 
	}
	
	
	
	
	
	
	
	
}
