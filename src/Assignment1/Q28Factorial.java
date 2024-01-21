package Assignment1;

public class Q28Factorial {

	
	    public static void main(String[] args) {
	        int number = 5; // Change the number for which you want to find the factorial
	        
	        long factorial = calculateFactorial(number);
	        
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }

	    public static long calculateFactorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * calculateFactorial(n - 1);
	        }
	    }
	}

