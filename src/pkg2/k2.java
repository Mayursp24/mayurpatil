package pkg2;

import java.util.Scanner;

public class k2 {

 
public static void main(String[] args) {
	
	Scanner k=new Scanner(System.in);
	System.out.println("enter the Number");
        int number =k.nextInt();
        
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");



}
		

        

}

   
    
    

                                                                                                                                                                                                                                                                                                                          

















