package sorting_algorithms;

import java.util.Random;

public class Sorting{
	public  int[] bubbleSort (int[] arr) {
		return arr;
	}
	
	public  int[] insertionSort (int[] arr) {
		return arr;
	}
	
	public static void main (String[] args) {
		Sorting sorter = new Sorting();
		
		int[] arr = new int[15];
		Random rd = new Random();
		
		System.out.print("Array to sort: [ ");
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = rd.nextInt(100); // storing random integers in an array
        	System.out.print(arr[i] + " "); // printing each array element
        }
        System.out.println("]");
        
        long start1 = System.currentTimeMillis();
        int[] sorted1 = sorter.bubbleSort(arr); 
        long end1 = System.currentTimeMillis();
        
        System.out.print("The array got sorted by Bubble Sort to: [ ");
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(sorted1[i] + " "); 
        }
        System.out.println("]");
        System.out.println("It took " + (end1-start1) + " ms");
        
        long start2 = System.currentTimeMillis();
        int[] sorted2 = sorter.bubbleSort(arr); 
        long end2 = System.currentTimeMillis();
        
        System.out.print("The array got sorted by Insertion Sort to: [ ");
        for (int i = 0; i < arr.length; i++) {
        	System.out.print(sorted2[i] + " "); 
        }
        System.out.println("]");
        System.out.println("It took " + (end2-start2) + " ms");
        
	}
	
	
}
