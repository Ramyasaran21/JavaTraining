package Day3;

public class AverageCalc {
	

	    public static void main(String[] args) {
	        int[] numbers = {5, 10, 15, 20, 25}; // Example array of numbers

	        double average = calculateAverage(numbers);
	        System.out.println("The average is: " + average);
	    }

	    public static double calculateAverage(int[] array) {
	        int sum = 0;

	        for (int number : array) {
	            sum += number;
	        }

	        return (double) sum / array.length;
	    }
	}


