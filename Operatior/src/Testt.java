
public class Testt {

	public enum Days{Mon,Tue,Wed};
	
	public static void main(String[] args) {
	
	for(Days d:Days.values());
	Days[] d2=Days.values();
	System.out.println(d2[2]);
}
}