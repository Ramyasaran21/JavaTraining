package Day2;

public class pattern {

	

	    public static void main(String[] args) {
	        for (int i = 0; i < 5; i++) {  // Outer loop for repetition
	            String pattern = "";  // Initialize an empty string to store the pattern
	            for (int j = 1; j <= 5; j++) {  // Inner loop for generating the pattern
	                pattern += j;  // Append each number to the pattern string
	            }
	            System.out.println(pattern);  // Print the pattern for each repetition
	        
	    }
	}
}
