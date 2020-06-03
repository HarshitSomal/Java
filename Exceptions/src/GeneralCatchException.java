
public class GeneralCatchException {
	
	public static void main(String[] args) {
		
	
      	int a[]= {10,2,3};
	
     String name=null;
	
	try {
		
		
		System.out.println(a[21]);
	    System.out.println(10/0);
	   System.out.println("name==" +name.length());
	    System.out.println("File Created");
	}
	
	
	catch(ArrayIndexOutOfBoundsException a2) {
		System.out.println("Array Exception");
	}
	catch(ArithmeticException a1){
		System.out.println("ArithmeticException");
	}
	catch(NullPointerException ne) {
		System.out.println("Null Point Exception");
		
	}
   catch(Exception e) {
		
		System.out.println("GeneralException");
	}
	
}



}

