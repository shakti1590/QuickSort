// Java implementation of QuickSort

import java.io.*;

class quicksort {

	//  Always pick first element as pivot
	static void swap(int[] arr, int i, int j)
	{
		//swap
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	static int partition(int[] arr, int low, int high)
	{

		// pivot
		int pivot = arr[high];

		
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {

			// If current element is smaller
			// than the pivot
			if (arr[j] < pivot) {

				// Increment index of
				// smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	
	static void quickSort(int[] arr, int low, int high)
	{
		if (low < high) {

			// pi is partitioning index, arr[p]
			
			int pi = partition(arr, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	// Function to print an array
	static void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver Code
	public static void main(String[] args)
	{
		// taking arr as input
		int[] arr = { 11, 17, 18, 9, 10, 35 }; // Given inputs
		int n = arr.length;
                // calling quickSort function
		quickSort(arr, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(arr, n);
	}
}

//Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle.
