import java.util.Scanner;

public class Star2 {
public static void main(String[] args) {
	 int n;  
     System.out.println("Enter the number till you want a star pattern");  
     Scanner scan = new Scanner(System.in);  
     n = scan.nextInt();  

             for(int i=0; i<n; i++)  
               {  
            	 for(int k=i; k<0; k--)  
                 {  
                         
                      System.out.print(" ");  
                 }  
               for(int j=0; j<n-i; j++)  
               {  
                    System.out.print("*");  
               }  
               //for jump to next line  
               System.out.println("");  
          }  
}
}
