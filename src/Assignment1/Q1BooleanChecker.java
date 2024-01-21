

package Assignment1;

import java.util.Scanner;


// Q1 

public class Q1BooleanChecker {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 Boolean a,b,c;
		 int  TrueCount = 0 ;
		 
		 System.out.println("Please Enter the Input for A");
		 a = scanner.nextBoolean();
		 
		 System.out.println("Please Enter the Input for B");
		 b = scanner.nextBoolean();
		 
		 System.out.println("Please Enter the Input for C");
		 c = scanner.nextBoolean();

		 if (a==true) TrueCount++;
		 if (b==true) TrueCount++;
		 if (c==true) TrueCount++;
		 
		 if (TrueCount >=2)
			 			 System.out.println("Atleast two input are true ");
		 
		 else
			 
			 System.out.println("Two inputs are not true");
	}

}
