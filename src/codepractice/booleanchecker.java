package codepractice;
import java.util.Scanner;


public class booleanchecker {
	
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean a,b ,c;
		int Truecount = 0;
		
		System.out.println("Please Enter the Input for A");
		a = scanner.nextBoolean(); 

		System.out.println("Please Enter the Input for B");
		b = scanner.nextBoolean(); 
		

		System.out.println("Please Enter the Input for C");
		c= scanner.nextBoolean(); 
		
		if(a==true)Truecount++;
		if(b==true)Truecount++;
		if(c==true)Truecount++;
		
		if(Truecount>=2)
			System.out.println("Atleast two input are true");
		
		else 
		
		System.out.println("Atleast two input are not true");
	}

}
