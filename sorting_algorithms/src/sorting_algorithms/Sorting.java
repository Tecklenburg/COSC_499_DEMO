package sorting_algorithms;

public class Sorting{
	public static void main (String[] args) {
		System.out.println("Interesting Stuff to come");
	}
	
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
		return arr;
	}
}
