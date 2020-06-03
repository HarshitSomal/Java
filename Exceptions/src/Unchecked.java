
public class Unchecked {

	
	public static void main(String[] args) {
		System.out.println("File Created1");
		
		
		try {
		System.out.println(10/0);
		System.out.println("File Created");
		System.out.println("Thanks");
		
		
		}
		catch(ArithmeticException ae) {
			System.out.println("File");
			
		}
		System.out.println("File Created3");
		
	}
	
	
}
