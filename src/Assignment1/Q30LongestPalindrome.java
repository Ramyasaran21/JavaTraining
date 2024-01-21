package Assignment1;

public class Q30LongestPalindrome {
	

	    public static void main(String[] args) {
	        String str = "babad";

	        String longestPalindrome = findLongestPalindrome(str);

	        System.out.println("Longest palindrome: " + longestPalindrome);
	    }

	    public static String findLongestPalindrome(String str) {
	        if (str == null || str.length() < 2) {
	            return str;
	        }

	        String longestPalindrome = "";

	        for (int i = 0; i < str.length(); i++) {
	            String palindromeOdd = expandAroundCenter(str, i, i);
	            String palindromeEven = expandAroundCenter(str, i, i + 1);

	            if (palindromeOdd.length() > longestPalindrome.length()) {
	                longestPalindrome = palindromeOdd;
	            }

	            if (palindromeEven.length() > longestPalindrome.length()) {
	                longestPalindrome = palindromeEven;
	            }
	        }

	        return longestPalindrome;
	    }

	    public static String expandAroundCenter(String str, int left, int right) {
	        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
	            left--;
	            right++;
	        }

	        return str.substring(left + 1, right);
	    }
	}



