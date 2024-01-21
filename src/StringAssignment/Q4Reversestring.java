package StringAssignment;

public class Q4Reversestring {
	

	    public static void main(String[] args) {
	        String inputString = "Java";
	        String reversedString = "";

	        for (int i = inputString.length() - 1; i >= 0; i--) {
	            reversedString += inputString.charAt(i);
	        }

	        System.out.println("Original String: " + inputString);
	        System.out.println("Reversed String: " + reversedString);
	    }
	}



