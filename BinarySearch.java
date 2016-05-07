 
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
 
class BinarySearch{
 
	public static int searchNum(int[] arr, int n, int min, int max){
		int mid = (min + max) / 2;			// to find the mid index in the array
 		System.out.print(mid);
 		
		if(arr[mid] == n){					
			return mid;
		}
		else if (arr[mid] > n){
			return searchNum(arr, n, min, mid - 1);
		}
		else if (max < min){				// if the number isn't found in the array
			return -1;
		}
		else return searchNum(arr, n, mid + 1, max);	// if (arr[mid] < n)	
	}
 
	public static int[] populateArray(int[] array){		// populate array numbers randomly
		for (int i = 0; i < array.length; i++ ){
			array[i] = (int)(Math.random()*10 + 10);
		}
		return array;
	}
 
	public static void main(String[] args){
 
		int[] myArray = new int[10];
		populateArray(myArray);
		
		for (int number : myArray) {				// printing random Array
	   		System.out.print(number + " ");
	   	}
	   	Arrays.sort(myArray);					// sorting array
	   	System.out.println(" ");
		System.out.println("The sorted int array is:");
	   	
	   	for (int number : myArray) {
	   		System.out.print(number + " ");
	   	}
 		System.out.println(" ");
		System.out.print("Index: " + searchNum(myArray, 11, 0, myArray.length-1)); // Finding Index of value = 11 in array
	}
 
}
