


class Marker{
	int cost;
	double size;
	
	void write() {
		
		System.out.println("I am a method");
		
	}
}
public class Test1 {
public static void main(String[] args) {
	
	Marker a=new Marker();
	a.cost=200;
	a.size=2.5;
	a.write();
	System.out.println("cost = " + a.cost);
	System.out.println("size = " + a.size);

	
	
}


}





