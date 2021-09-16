package sorting_algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
	Sorting sorter;
	@BeforeEach
	void setUp() {
		sorter = new Sorting();
	}
	
	@Test
	void testSortingArrayInCorrectOrder() {
		int[] arr = {9,2,5,3,1};
		int[] res = sorter.insertionSort(arr);
		int[] exp = {1,2,3,5,9};
		for(int i=0; i<arr.length; i++) {
			assertEquals(exp[i], res[i], "Sorting should work");
		}
	}
	
	@Test
	void testDealWithEmptyArray() {
		int[] arr = new int[0];
		assertEquals(0, sorter.insertionSort(arr).length, "Should return empty array"); 
	}
}
