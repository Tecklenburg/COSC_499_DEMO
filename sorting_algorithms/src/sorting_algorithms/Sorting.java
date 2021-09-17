package sorting_algorithms;

import java.util.Random;

// Program compare runtimes of bubble and insertion sort 
public class Sorting{

	public int[] bubbleSort (int[] arr) {
		for(int i=arr.length; i>1; --i) {
			for (int j=0; j<i-1; ++j){
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public int[] insertionSort (int[] arr) {
		for(int i=1; i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while (j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}

	public static void main (String[] args) {
		Sorting sorter = new Sorting();
		
		int[] arr1 = new int[15];
		int[] arr2 = new int[15];
		Random rd = new Random();
		
		// populate random array
		System.out.print("Array to sort: [ ");
        for (int i = 0; i < arr1.length; i++) {
        	int val = rd.nextInt(100);
        	arr1[i] = val;
        	arr2[i] = val;
        	System.out.print(arr1[i] + " "); 
        }
        System.out.println("]");
        
        
        // Run and measure Bubble Sort
        long start1 = System.nanoTime();
        int[] sorted1 = sorter.bubbleSort(arr1); 
        long end1 = System.nanoTime();
        
        System.out.print("The array got sorted by Bubble Sort to: [ ");
        for (int i = 0; i < sorted1.length; i++) {
        	System.out.print(sorted1[i] + " "); 
        }
        System.out.println("]");
        System.out.println("It took " + (end1-start1) + " ns");
        
        
        // Run and measure Insertion Sort
        long start2 = System.nanoTime();
        int[] sorted2 = sorter.insertionSort(arr2); 
        long end2 = System.nanoTime();
        
        System.out.print("The array got sorted by Insertion Sort to: [ ");
        for (int i = 0; i < sorted2.length; i++) {
        	System.out.print(sorted2[i] + " "); 
        }
        System.out.println("]");
        System.out.println("It took " + (end2-start2) + " ns");
        
	}
	
	
}
