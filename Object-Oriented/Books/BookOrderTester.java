/*
 * 
 * אבשלום אלמו - 313233827
 */
public class BookOrderTester {

	public static void main(String[] args) {

		
		book book1 = new book("java concepts","Cay s. Horstman", 400);
		book book2 = new book("Thinking in java","Bruce Eckel", 1500);
		book book3 = new book("java, How to program","P. Deitel, H. Deitel", 1200);
		book book4 = new book("Effactive java","Joshua Bloch", 500);
		book book5 = new book("java : A Beginner's Guide","Herbert Schildt", 900);

		BookOrder javabooks = new BookOrder(12407,"24 - Aug - 2021");
		javabooks.addbook(book1);
		javabooks.addbook(book2);
		javabooks.addbook(book3);
		javabooks.addbook(book4);
		javabooks.addbook(book5);
		
		System.out.print(javabooks.toString());

	}

}
