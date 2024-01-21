package Day3;
import java.util.Arrays;

public class ArraySorter {

	
	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 9, 1, 7}; // Numeric array
	        String[] strings = {"apple", "orange", "banana", "grape", "pear"}; // String array

	        sortNumericArray(numbers);
	        sortStringArray(strings);

	        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));
	        System.out.println("Sorted string array: " + Arrays.toString(strings));
	    }
	    
	    public static void sortNumericArray(int[] array) {
	        Arrays.sort(array);
	    }

	    public static void sortStringArray(String[] array) {
	        Arrays.sort(array);
	    }
	}
	

	