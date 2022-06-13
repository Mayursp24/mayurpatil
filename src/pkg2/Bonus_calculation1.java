package pkg2;

import java.util.Scanner;

public class Bonus_calculation1 {

	
	public static void main(String[] args) {
		
		Scanner k=new Scanner(System.in);
		
		System.out.println("Enter the grade = ");
		int grade=k.nextInt();
		System.out.println("Enter Experiance = ");
		int exp=k.nextInt();
		
		
		if (grade>=8)
		{         if (exp>=5)
		         {  System.out.println("======Your Eligible For 15% Bonus======");               
			
		            System.out.println("enter Sallery=");
		            int sallery=k.nextInt();
		
		int m=sallery+((sallery/100)*15);
		System.out.println("Yours total sallery = " +m);}
			
		}
		else 
			  {System.out.println("======Your not Eligible For 15% Bonus======");}
		
		
		k.close();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
