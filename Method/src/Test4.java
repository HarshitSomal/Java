
public class Test4 {
public static void main(String[] args) {
	double i= avg(19,14,17);
	double j = avg(15,16,22);
	System.out.println("A is " +i);
	System.out.println("B is "+j);
	
}

static double avg(int a,int b,int c)
{
	double res=(a+b+c)/3;
	return res;
}



}
