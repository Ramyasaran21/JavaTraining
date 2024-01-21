package Assignment1;

public class Q23InputDifferentiators {

	
	    public static void main(String[] args) {
	        String input = "true"; // Replace with your input

	        if (isInteger(input)) {
	            System.out.println("Input is an integer.");
	        } else if (isBoolean(input)) {
	            System.out.println("Input is a boolean.");
	        } else {
	            System.out.println("Input is a string.");
	        }
	    }

	    public static boolean isInteger(String input) {
	        try {
	            Integer.parseInt(input);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

	    public static boolean isBoolean(String input) {
	        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
	    }
	}


