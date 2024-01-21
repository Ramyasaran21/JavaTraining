package Assignment1;
// Write a method that will remove given character from the String?
public class Q16RemoveCharterString {
	
	
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        char charToRemove = 'l';

	        String result = removeCharacter(str, charToRemove);
	        System.out.println("Result: " + result);
	    }

	    public static String removeCharacter(String str, char charToRemove) {
	        StringBuilder sb = new StringBuilder();
	        for (char c : str.toCharArray()) {
	            if (c != charToRemove) {
	                sb.append(c);
	            }
	        }
	        return sb.toString();
	    }
	}


