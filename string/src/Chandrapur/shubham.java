package Chandrapur;

public class shubham {

  public static void main(String[] args) {
	
	String a = "Velocity class";
	
    System.out.println(a.substring(3)); //it will start to print from c= city class	
	System.out.println(a.substring(3,10));
	
	String b=  "    Velocity class   " ;
	
	System.out.println(b);       //it does not remove before nd  after space
	
	//it remove starting and ending space only
	System.out.println(b.trim());
 }
}