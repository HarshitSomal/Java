
class Cycle{
	
	int cost;
	String name;
	
	void ride() {
		System.out.println("i am parentcycle");
	}
	
}
class Bike extends Cycle{
    void start()	{
	
    	
   System.out.println("i am childBike");
}
	
	
}



public class Inheritance {
public static void main(String[] args) {
	
	Bike b=new Bike();
	b.cost=200;
	b.name="Modified";
	b.ride();
	b.start();
	System.out.println("cost= "+b.cost);
	System.out.println("name= "+b.name);
	
	System.out.println("-----------------------");
	
	Cycle c=new Cycle();
	c.cost=100;
	c.name="Pooja";
	c.ride();
	System.out.println("cost= "+b.cost);
	System.out.println("name= "+b.name);
	
	System.out.println("---Parent reference--------------------");
	
	Cycle d=new Bike();
	d.cost=300;
	d.name="Modified";
	d.ride();
	
	System.out.println("cost= "+d.cost);
	System.out.println("name= "+d.name);
	
	System.out.println("-----------------------");
	
	
	
	
	
	
	
	
	
	
}
}
