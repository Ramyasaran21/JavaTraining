package Assignment1;

public class Q26MergeSortedArrays {
	

	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 4, 6, 9, 10};
	        int[] array2 = {3, 5, 7, 8};

	        mergeArrays(array1, array2);

	        System.out.print("After merge: array1 = ");
	        for (int num : array1) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void mergeArrays(int[] array1, int[] array2) {
	        int length1 = array1.length;
	        int length2 = array2.length;
	        int mergedLength = length1 + length2;

	        int i = length1 - 1;
	        int j = length2 - 1;
	        int k = mergedLength - 1;

	        while (i >= 0 && j >= 0) {
	            if (array1[i] >= array2[j]) {
	                array1[k] = array1[i];
	                i--;
	            } else {
	                array1[k] = array2[j];
	                j--;
	            }
	            k--;
	        }

	        while (j >= 0) {
	            array1[k] = array2[j];
	            j--;
	            k--;
	        }
	    }
	}



