package codepractice;

public class factorial{
	
	public static void main(String[]args) {
		
		int number = 3;
		int factorial = getfactorial(number);
		System.out.println("The Factorial of "+number+":" +factorial);
	}
	
   public static int getfactorial (int number) {
	   int factorial =1;
	   for(int i=1;i<=number;i++) {
		   
		   factorial = factorial * i;
		   
		   
	   }
	   return factorial;	   
		   
	   
   }	
}




//package codepractice;
//
//public class factorial {
//
//
//	    public static void main(String[] args) {
//	        int number = 12;
//	        
//	        int factorial = calculateFactorial(number);
//	        
//	        System.out.println("Factorial of " + number + " = " + factorial);
//	    }
//	    
//	    public static int calculateFactorial(int number) {
//	        int factorial = 1;
//	        
//	        for (int i = 1; i <= number; i++) {
//	            factorial = factorial* i;
//	        }
//	        
//	        return factorial;
//	    }
//	
//	
//}
// 