package Chandrapur;

public class yogesh {
   
	public static void main(String[] args) {
	
		String a = "Velocity"; //coz it allot same memory thats y true
		String b = "Velocity";
		
		String c = new String ("Velocity"); //
		String d = new String ("Velocity");
		
		System.out.println(a==b);//compare the adressed true or false
		
		System.out.println(c==d);
		
		b ="Class";
		
		System.out.println(a); 
		System.out.println(b);
}
	
}
