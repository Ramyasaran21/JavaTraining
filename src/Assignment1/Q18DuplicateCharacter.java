package Assignment1;

import java.util.HashMap;
import java.util.Map;


public class Q18DuplicateCharacter {
	
	

	    public static void main(String[] args) {
	        String input = "Hello World";

	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count the occurrence of each character in the input string
	        for (char c : input.toCharArray()) {
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                charCountMap.put(c, 1);
	            }
	        }

	        // Display the duplicate characters
	        System.out.println("Duplicate characters in the string '" + input + "':");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }
	}



