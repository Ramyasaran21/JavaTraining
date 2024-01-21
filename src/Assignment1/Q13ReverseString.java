package Assignment1;

	
	import java.util.Scanner;

	public class Q13ReverseString {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        String reversedString = reverseString(inputString);
	        
	        System.out.println("Reversed string: " + reversedString);
	    }
	    
	    public static String reverseString(String input) {
	        StringBuilder reversed = new StringBuilder();
	        
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed.append(input.charAt(i));
	        }
	        
	        return reversed.toString();
	    }
	}



