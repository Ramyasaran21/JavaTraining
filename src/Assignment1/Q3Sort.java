package Assignment1;

public class Q3Sort {
	
	
	    public static void main(String[] args) {
	        int[] numbers = {5, 2, 8, 12, 1}; // Sample array
	        System.out.println("Original array:");
	        printArray(numbers);
	        
	        bubbleSort(numbers);
	        
	        System.out.println("Sorted array in ascending order:");
	        printArray(numbers);
	    }
	    
	    public static void bubbleSort(int[] array) {
	        int n = array.length;
	        
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	            	
	            	System.out.println(j+  " "+(j+1));
	            	 
	           
	                if (array[j] > array[j + 1]) {
	                    // Swap array[j] and array[j + 1]
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }
	    } 
	    public static void printArray(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	}



 