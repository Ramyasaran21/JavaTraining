package Assignment1;

public class Q6Ascsort {
	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 8, 12, 1}; // Sample array
	        System.out.println("Original array:");
	        printArray(numbers);
	        
	        selectionSort(numbers);
	        
	        System.out.println("Sorted array in ascending order:");
	        printArray(numbers);
	    }
	    
	    public static void selectionSort(int[] array) {
	        int n = array.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            
	            for (int j = i + 1; j < n; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j;
	                }
	            }
	            
	            // Swap array[i] and array[minIndex]
	            int temp = array[i];
	            array[i] = array[minIndex];
	            array[minIndex] = temp;
	        }
	    }
	    
	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}

