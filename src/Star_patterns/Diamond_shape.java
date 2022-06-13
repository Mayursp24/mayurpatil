package Star_patterns;

public class Diamond_shape {
	
		
	
	public static void m1() {
		
		for (int i=1;i<=5;i++) 
	    {
	 	   
	 	          for(int j=4;j>=i;j--) 
	 	          {
	 	        	  System.out.print("  "); 
	 	          }
	 	          for(int j=1;j<=i;j++) 
	 	          {
	 	        	  System.out.print("*   ");
	 	          }
	 	          System.out.println( );
	 	       
	    }
		for (int i=1;i<=5;i++) 
	    {
	 	   
	 	         
	 	          for(int j=1;j<=i;j++) 
	 	          {
	 	        	  System.out.print("  ");
	 	          }
	 	         for(int j=4;j>=i;j--) 
		          {
		        	  System.out.print("*   "); 
		          }
	 	          System.out.println( );
	 	         
	    }

		System.out.print("");
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			m1();
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
		

