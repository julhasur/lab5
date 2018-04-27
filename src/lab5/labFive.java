/*Name:Julhasur Chowdhury
 * date:4/26/18
 * Calculate the factorial of a number.
 */


package lab5;
import java.util.Scanner;

public class labFive {
	public static void main (String[]args) {
		char option;
		int Usernumber;
		do{
			
			Scanner scnr=new Scanner(System.in);
		
		
		
		System.out.println("Enter a number: ");
		Usernumber=scnr.nextInt();
			
		if((Usernumber<1)||(Usernumber>10)) { //to validate the number
				System.out.println("Please enter a number between 1 to 10 only.");
		}
		 else if ((Usernumber>=1)&&(Usernumber<=11)) {//if the number is right the program starts running
		
		System.out.println(factorial(Usernumber));//calling method (factorial)
		 }
		System.out.println("would you like to continue(Y/N)");
		 
		 
		option=scnr.next().charAt(0);
		 }
		
		while((option!='n')&&(option!='N'));//to validate if the user wants to continue
		   System.out.println("Bye");  
	}




	
		
	


//creating another method to do all the calculation.
	public static long factorial (int number) {
		
		
		long result=1;
		for (int factor=1;factor<=number;factor++) {
		result*=factor;
		}
		return result;
		
		
	}

	}
