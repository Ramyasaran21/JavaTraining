package StringAssignment;

public class Q3SubStringReplacement {
	

	    public static void main(String[] args) {
	        String inputString = "Dog chases cat, cat chases rat";
	        String searchString = "cat";
	        String replacementString = "rat";

	        String replacedString = replaceSubstring(inputString, searchString, replacementString);

	        System.out.println("Original String: " + inputString);
	        System.out.println("Replaced String: " + replacedString);
	    }

	    public static String replaceSubstring(String inputString, String searchString, String replacementString) {
	        return inputString.replace(searchString, replacementString);
	    }
	}



