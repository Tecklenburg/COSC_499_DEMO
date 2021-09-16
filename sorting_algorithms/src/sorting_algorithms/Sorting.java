package sorting_algorithms;

public class Sorting{
	public static void main (String[] args) {
		System.out.println("Interesting Stuff to come");
	}
	
	public int[] bubbleSort (int[] arr) {
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
}
