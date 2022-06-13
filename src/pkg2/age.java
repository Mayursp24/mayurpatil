package pkg2;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
	Scanner k=new Scanner(System.in) ;
		    System.out.println("insert the value of p1= ");   
	        int p1=k.nextInt();
	        System.out.println("insert the value of p2= ");
			int p2=k.nextInt();
			System.out.println("insert the value of p3= ");
			int p3=k.nextInt();
		
			if(p1>p2)
			    {     
				        if(p1>p3)
				        {System.out.println("p1 is oldest");
				            if (p2>p3)
				            {System.out.println("p3 is yongest");}
				            else
				            {System.out.println("p2 is yongest");}
				        }
				         else
				         {System.out.println("p3 is oldest");}
				         {System.out.println("p2 is youngest");}
			    }      
			else  //p1<p2
			{           if(p2>p3)
			              {{System.out.println("p2 is oldest");}
			                      if(p1>p3)
			                      {System.out.println("p3 is youngest");}
			                      else
			                      {System.out.println("p1 is youngest");}}
			              else 
			              {{System.out.println("p3 is oldest");}
			                  {System.out.println("p1 is youngest");}
		    }
			
			k.close();
		}
				        	
				
	   }
		
	}

			
			
			
			
			
		

