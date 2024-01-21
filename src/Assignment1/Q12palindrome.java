package Assignment1;


	import java.util.Scanner;

	public class Q12palindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string or number: ");
	        String input = scanner.nextLine();

	        if (isPalindrome(input)) {
	            System.out.println("The input is a palindrome.");
	        } else {
	            System.out.println("The input is not a palindrome.");
	        }

	        scanner.close();
	    }

	    public static boolean isPalindrome(String input) {
	        int length = input.length();
	        for (int i = 0; i < length-1; i++) {
	            if (input.charAt(i) != input.charAt(length - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

