package StringAssignment;

public class Q5CharacterCount {
	
	
	    public static void main(String[] args) {
	        String inputString = "Hello Java 8";
	        int integerCount = 0;
	        int uppercaseCount = 0;
	        int lowercaseCount = 0;

	        for (char c : inputString.toCharArray()) {
	            if (Character.isDigit(c)) {
	                integerCount++;
	            } else if (Character.isUpperCase(c)) {
	                uppercaseCount++;
	            } else if (Character.isLowerCase(c)) {
	                lowercaseCount++;
	            }
	        }

	        System.out.println("Input String: " + inputString);
	        System.out.println("Integer Count: " + integerCount);
	        System.out.println("Uppercase Count: " + uppercaseCount);
	        System.out.println("Lowercase Count: " + lowercaseCount);
	    }
	}



