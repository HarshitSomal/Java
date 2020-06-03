
public class Pramid {
public static void main(String[] args) {
	int s=4,l=1,i,j;
	
	for(i=1;i<=5;i++)   //Outer loop=5
{
		
			for(j=1;j<=s;j++) {  //space s=4
		
		System.out.print("x");
	
}
	for(j=1;j<=l;j++) // star l=1,3,5,7
	{
		System.out.print("*");
}
	System.out.println();
	s--;
	l+=2;
}
}}
