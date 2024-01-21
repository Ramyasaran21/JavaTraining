package Assignment1;
//WJP to find total number of integers, uppercase and lowercase character in the give string	

public class Q17CountCharacter {
	
	
	    public static void main(String[] args) {
	        String str = "Hello World 123";
	        
	        int totalIntegers = countIntegers(str);
	        int totalUppercase = countUppercase(str);
	        int totalLowercase = countLowercase(str);
	        
	        System.out.println("Total Integers: " + totalIntegers);
	        System.out.println("Total Uppercase Characters: " + totalUppercase);
	        System.out.println("Total Lowercase Characters: " + totalLowercase);
	    }

	    public static int countIntegers(String str) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (Character.isDigit(c)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    public static int countUppercase(String str) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    public static int countLowercase(String str) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (Character.isLowerCase(c)) {
	                count++;
	            }
	        }
	        return count;
	    }
	}



