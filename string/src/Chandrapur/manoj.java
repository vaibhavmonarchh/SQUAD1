package Chandrapur;

public class manoj {
  
	public static void main(String[] args) {
		
		//equal method is used to compare to 2 strings
	
		//equal method id used to compare only data not adressed//
		String a = "Velocity";
		String b = new String ("Velocity");
		
	    boolean  r = a.equals(b);
		System.out.println(r);
				
		r = b.equals(a);
		System.out.println(r);
	
		
	    r = b.equals("Velocity"); //true
    	System.out.println(r);
	 
		
	    r = b.equals("velocity"); //false coz v is small and its not present
     	System.out.println(r);
	
	    r = a.equalsIgnoreCase("velocity"); //char will check
	    System.out.println(r);
	
	    
	}
	
}
      