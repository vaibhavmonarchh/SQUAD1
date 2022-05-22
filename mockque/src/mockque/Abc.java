package mockque;

public class Abc {

	  int a = 10; //global variable
	
	public void A ()
	   {
	    int x = 20; //local variable 
		System.out.println(x);
	   }
	
	public void B ()
	   {
		int y =30;
		System.out.println(y);
	   }
	
	public void C ()
	   {
		int z =40;
		System.out.println(z);
	   }
	
	public static void main(String[] args) {
		
	   Abc v = new Abc ();
	
	  System.out.println(v.a);
	  v.A();
	  v.B();
	  v.C();
	  
   }
}
