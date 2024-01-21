package Assignment1;



	
	import java.util.ArrayList;
	import java.util.List;
	
	public class DuplicateCharacter {
	    public static void main(String[] args) {
	        String inputString = "Hello";
	        List<Character> duplicateCharacters = new ArrayList<>();

	        for (int i = 0; i < inputString.length(); i++) {
	            char currentChar = inputString.charAt(i);
	            if (inputString.indexOf(currentChar, i + 1) != -1 && !duplicateCharacters.contains(currentChar)) {
	                duplicateCharacters.add(currentChar);
	            }
	        }

	        if (!duplicateCharacters.isEmpty()) {
	            System.out.print("Duplicate characters: ");
	            for (char ch : duplicateCharacters) {
	                System.out.print(ch + " ");
	            }
	        } else {
	            System.out.println("No duplicate characters found.");
	        }
	    }
	}



