
class Parent{
	
	void normal() {
		
		System.out.println("normal");
	}
}
class Child extends Parent{
	
	void normal() {
		
		System.out.println("Modified");
	}

}

public class OverridingMethod {
	
public static void main(String[] args) {
	
	Parent p=new Child();
	p.normal();
	
	
	
}
	
	
	
	
}
