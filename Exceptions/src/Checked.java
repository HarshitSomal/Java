import java.io.File;
import java.io.IOException;

public class Checked {
public static void main(String[] args) {
	
	File F=new File("Vikas.txt");
      try {
		F.createNewFile();
		System.out.println("File Created");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("File not Created");
		
		
	}
	
	
	
}
}
