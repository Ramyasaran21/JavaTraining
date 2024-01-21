package Assignment1;


import java.util.HashMap;
import java.util.Map;

public class Q19CharacterOccurence {
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

        // Display the count of occurrences for each character
        System.out.println("Count of occurrences for each character in the string '" + input + "':");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



