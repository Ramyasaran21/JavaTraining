package Assignment1;

public class Q20CharacterCount {
	
	
	    public static void main(String[] args) {
	        String input = "Hello World 12345";

	        int repeatedIntegers = 0;
	        int uppercaseCount = 0;
	        int lowercaseCount = 0;

	        int[] digitCount = new int[10]; // To count the occurrences of each digit

	        // Count the occurrences of each character in the input string
	        for (char c : input.toCharArray()) {
	            if (Character.isDigit(c)) {
	                digitCount[c - '0']++;
	                if (digitCount[c - '0'] > 1) {
	                    repeatedIntegers++;
	                }
	            } else if (Character.isUpperCase(c)) {
	                uppercaseCount++;
	            } else if (Character.isLowerCase(c)) {
	                lowercaseCount++;
	            }
	        }

	        // Display the total number of repeated integers, uppercase characters, and lowercase characters
	        System.out.println("Total number of repeated integers: " + repeatedIntegers);
	        System.out.println("Total number of uppercase characters: " + uppercaseCount);
	        System.out.println("Total number of lowercase characters: " + lowercaseCount);
	    }
	}



