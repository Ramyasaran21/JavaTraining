 package Assignment1;
 
 public class Q4ArraypalindromeChecker{
	 
	 public static void main(String [] args) {
		 
		int number[] = {1,2,1,1,1};
		
		boolean ispalindrome = checkarrypalindrome(number);
		if(ispalindrome)
		{
			System.out.println("The array is Plaindrome");
		}
		
		else
			
		{
			System.out.println("The array is not palindrome");	
	
		
	 }
		}
	public static boolean checkarrypalindrome(int[] array)	{
		
		int start=0;
		int end =array.length-1;
		
		while(start<end) 
		
		{
			if(array[start]!= array[end]) {
				
				return false;
			
			}
			start++;
			end--;	
		}
		
		return true;
		}
	
	 
 }

//public class Q4ArraypalindromeChecker {
//	
//
//	    public static void main(String[] args) {
//	        int[] numbers = {1, 2, 3, 2, 1}; 
//	        boolean isPalindrome = checkArrayPalindrome(numbers);
//	        
//	        if (isPalindrome) {
//	            System.out.println("The array is a palindrome.");
//	        } else {
//	            System.out.println("The array is not a palindrome.");
//	        }
//	    }
//	    
//	    public static boolean checkArrayPalindrome(int[] array) {
//	        int start = 0;
//	        int end = array.length - 1;
//	        
//	        while (start < end) {
//	            if (array[start] != array[end]) {
//	                return false;
//	            }
//	            
//	            start++;
//	            end--;
//	        }
//	        
//	        return true;
//	    }
//	}
//
//
//
//
