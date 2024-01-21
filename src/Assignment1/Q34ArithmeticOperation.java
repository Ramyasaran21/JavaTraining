package Assignment1;

public class Q34ArithmeticOperation {
	
	
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 5;
	        
	        int multiplicationResult = multiply(a, b);
	        int subtractionResult = subtract(a, b);
	        int divisionResult = divide(a, b);

	        System.out.println("Multiplication: " + multiplicationResult);
	        System.out.println("Subtraction: " + subtractionResult);
	        System.out.println("Division: " + divisionResult);
	    }

	    public static int multiply(int a, int b) {
	        int result = 0;
	        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);
	        a = Math.abs(a);
	        b = Math.abs(b);

	        for (int i = 0; i < b; i++) {
	            result += a;
	        }

	        return isNegative ? negate(result) : result;
	    }

	    public static int subtract(int a, int b) {
	        return a + negate(b);
	    }

	    public static int divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero");
	        }

	        int result = 0;
	        boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);
	        a = Math.abs(a);
	        b = Math.abs(b);

	        while (a >= b) {
	            a = subtract(a, b);
	            result++;
	        }

	        return isNegative ? negate(result) : result;
	    }

	    public static int negate(int num) {
	        return -num;
	    }
	}



