

class Car
{
	int model;
	String name;
	
	void move() {
		System.out.println("I am a move()method");
	}

    void turn() {
    	
		System.out.println("I am a turn()method");

    	
    }
    
    }



public class Test2 {
public static void main(String[] args) {
	
	Car a= new Car();
	a.model=1999;
	a.name="Lexus";
	a.turn();
	a.move();
	
	
}
}
