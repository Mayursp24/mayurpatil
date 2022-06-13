package pkg2;

import java.util.Scanner;

public class If_else_Username_password {

	public static void main(String[] args) {
	Scanner k=new Scanner(System.in);
	
		System.out.println("Enter user name = ");
		String user_name=k.next();                                                       //"MAyursp24";
		System.out.println("Enter password name = ");
	String password= k.next();
	                                                         //"Mayur@123";
	String a="Mayursp24";
	 String b="Mayur@123";
	 
	 if (user_name.equals(a) && password.equals(b))
	 {
		   System.out.println("Login Succesfully");   
		 
		 
	 }
	 else {
		 
		 System.out.println("Invalid Credintial");
		 
	 }	

k.close();
}
}

	
	
	