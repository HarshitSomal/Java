
public class ThrowFinal2 {

	
	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		ThrowFinal1 f=new ThrowFinal1();
		
		try {
		f.bookseat();
		}
		catch(ArithmeticException ae) {
			
			System.out.println("Caught Exception in the main");
		
		}
		
		
		System.out.println("Main Ended");
		
		
		
	}
		
		
	}
	
	

