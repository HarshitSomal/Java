
public class ThrowFinal1 {

void bookseat() {
	System.out.println("Booking Started");
	
	
	try {
		
	
	System.out.println(10/0);
	
	}
catch(ArithmeticException ae) {
	
	System.out.println("Caught exception in the bookseat");
	
	throw ae;
	
}
	finally {
	
	System.out.println("Booking Ended");
	}
	
}
	
}
