
public class Test3 {
public static void main(String[] args) {
	
Cow a = new Cow();

a.age=22;
a.name="Simran";
a.eat();	

System.out.println("Name is " +a.name);
System.out.println("Age is " +a.age);

System.out.println("---------------------");

Cow b= new Cow();
b.age=33;
b.name="Priya";
b.eat();

System.out.println("Name is " +b.name);
System.out.println("Age is " +b.age);

}
}
