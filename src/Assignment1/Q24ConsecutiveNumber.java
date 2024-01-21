package Assignment1;
import java.util.Scanner;
public class Q24ConsecutiveNumber {

	
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive natural number: ");
	        int N = scanner.nextInt();

	        System.out.println("Possible consecutive number combinations:");
	        printConsecutiveCombinations(N);

	        scanner.close();
	    }

	    private static void printConsecutiveCombinations(int N) {
	        int start = 1;
	        int end = 2;
	        int sum = start + end;

	        while (start < N) {
	            if (sum == N) {
	                printCombination(start, end);
	                sum -= start;
	                start++;
	            } else if (sum < N) {
	                end++;
	                sum += end;
	            } else {
	                sum -= start;
	                start++;
	            }
	        }
	    }

	    private static void printCombination(int start, int end) {
	        for (int i = start; i <= end; i++) {
	            System.out.print(i);
	            if (i != end) {
	                System.out.print(" + ");
	            }
	        }
	        System.out.println();
	    }
	}


