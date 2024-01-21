package Assignment1;


	
	import java.util.HashSet;
	public class Q15UniqueWords {

	    public static void main(String[] args) {
	        String input = "Java is great and Java is versatile";

	        // Split the input string into words
	        String[] words = input.split(" ");

	        // Create a HashSet to store unique words
	        HashSet<String> uniqueWords = new HashSet<>();

	        // Iterate over the array of words and add each word to the HashSet
	        for (String word : words) {
	            uniqueWords.add(word);
	        }

	        // Print the unique words
	        System.out.println("Unique Words:");
	        for (String word : uniqueWords) {
	            System.out.println(word);
	        }
	    
	}
	}


