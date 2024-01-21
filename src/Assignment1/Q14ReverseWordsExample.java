package Assignment1;



	public class Q14ReverseWordsExample {
	    public static void main(String[] args) {
	        String input = "Java Code";

	        // Split the input string into words
	        String[] words = input.split(" ");

	        // Reverse and concatenate the words
	        StringBuilder reversedString = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedString.append(words[i]).append(" ");
	        }

	        // Remove trailing whitespace
	        reversedString.setLength(reversedString.length() - 1);

	        // Print the reversed string
	        System.out.println("Reversed String: " + reversedString.toString());
	    }
	}


