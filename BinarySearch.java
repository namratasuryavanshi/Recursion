 
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
 
class BinarySearch{
 
	public static int searchNum(int[] arr, int n, int min, int max){
		int mid = (min + max) / 2;
 		System.out.print(mid);
 		
		if(arr[mid] == n){
			return mid;
		}
		else if (arr[mid] > n){
			return searchNum(arr, n, min, mid - 1);
		}
		else if (arr[mid] < n){
			return searchNum(arr, n, mid + 1, max);
		}
		else return 1;
	}
 
	public static int[] populateArray(int[] array){
		for (int i = 0; i < array.length; i++ ){
			array[i] = (int)(Math.random()*10 + 10);
		}
		return array;
	}
 
	public static void main(String[] args){
 
		int[] myArray = new int[10];
		populateArray(myArray);
		
		for (int number : myArray) {
	   		System.out.print(number + " ");
	   	}
	   	Arrays.sort(myArray);
	   	System.out.println(" ");
		System.out.println("The sorted int array is:");
	   	
	   	for (int number : myArray) {
	   		System.out.print(number + " ");
	   	}
 		System.out.println(" ");
		//int index = searchNum(myArray, 11, 0, myArray.length-1);
		System.out.print("Index: " + searchNum(myArray, 11, 0, myArray.length-1));
	}
 
}
