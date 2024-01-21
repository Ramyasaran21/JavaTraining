package codepractice;

import java.util.HashMap; 

public class uniquenumber{
	
	public static void main(String[]args) {
		
		int duplicatearr[] = {2,3,4,5,6,7,8,2,3,4,9};
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
			for(int j=0;j<duplicatearr.length;j++) {
			hashmap.put(duplicatearr[j],j);
			
		}
			
		System.out.println(hashmap.keySet());
		
	}
	
}
//create UniqueElementsExample1 class to get distinct element from the array  
//class uniquenumber {   
//    //main() method starts  
//    public static void main(String args[])   
//    {   
//        //create an integer array having some duplicate elements   
//        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
//  
//        //create a hashmap having integer type of key-value  
//        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
//          
//        //use for loop to pull the elements of array to hashmap's key  
//        for (int j = 0; j < arrayWithDuplicates.length; j++) {   
//            hashmap.put(arrayWithDuplicates[j], j);   
//        }   
//        // use hashmap.keySet() for printing all keys of hashmap using it's keySet() method   
//        System.out.println(hashmap.keySet());   
//    
//    }   
//}  

//package codepractice;
//import java .util.*;
//public class uniquenumber {
//
//	public static void main (String[] args) {
//		
//		int arr[]  = {2,4,4,5,6,7,8,6,9,0};
//		 
//		for(int i=0;i<arr.length-1;i++) {
//			for (int j =i+1;j<=arr.length-1;j++)
//			{
//			if (arr[i]!= arr[i+1])
//				System.out.println(arr[i]+"");
//		}
//		}		
//			System.out.println(arr[arr.length-1]);
//			
//			
//	}
//}
//			
//
//			
//			