package StringAssignment;

public class Q2WordPresenceChecker {
	

	    public static void main(String[] args) {
	        String stringS = "I am learning qa automation testing";
	        String word = "qa";

	        boolean isPresent = checkWordPresence(stringS, word);

	        if (isPresent) {
	            System.out.println("The word '" + word + "' is present in the string.");
	        } else {
	            System.out.println("The word '" + word + "' is not present in the string.");
	        }
	    }

	    public static boolean checkWordPresence(String stringS, String word) {
	        String[] words = stringS.split(" ");

	        for (String s : words) {
	            if (s.equals(word)) {
	                return true;
	            }
	        }

	        return false;
	    }
	}


