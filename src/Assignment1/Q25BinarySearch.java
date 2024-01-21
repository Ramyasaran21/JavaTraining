package Assignment1;


	
	import java.util.Arrays;
	import java.util.Scanner;
	
	public class Q25BinarySearch {

	
	    public static void main(String[] args) {
	        int[] arr = new int[5];
	        Scanner scanner = new Scanner(System.in);

	        // Read binary elements from the user
	        System.out.println("Enter 5 binary elements:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // Display the sorted array
	        System.out.println("Sorted array: " + Arrays.toString(arr));

	        // Read the target element from the user
	        System.out.println("Enter the element to search:");
	        int target = scanner.nextInt();

	        // Perform binary search
	        int index = binarySearch(arr, target);

	        // Display the result
	        if (index != -1) {
	            System.out.println("Element found at index " + index);
	        } else {
	            System.out.println("Element not found");
	        }
	    }

	    public static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                return mid; // Found the target element
	            } else if (arr[mid] < target) {
	                left = mid + 1; // Target is in the right half
	            } else {
	                right = mid - 1; // Target is in the left half
	            }
	        }

	        return -1; // Target element not found
	    }
	}



