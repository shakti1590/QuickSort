// Java implementation of QuickSort
// Quicksort is a fast sorting algorithm that works by splitting a large array of data into smaller sub-arrays.
import java.io.*;
import java.util.*;

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

		//Here we pick a pivot that will be used for partition ahead
		
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
		return (i++); // -----hima---
	}

	
	static void quickSort(int[] arr, int low, int high)
	{
		//check if values are given correctly and then move ahead
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
		// taking array as input
		Scanner sc=new Scanner(System.in);  
		int p=sc.nextInt();
		// dynamic allocating the memory to array.
		int[] arr = new int[10];  
		//loop for updation of array.
		for(int i=0; i<p; i++)  
        	{  
            	arr[i]=sc.nextInt();  
        	}
                // calling quickSort function
		quickSort(arr, 0, p - 1);
		System.out.println("Sorted array: ");
		printArray(arr, p);
	}
}

//Quicksort is a sorting algorithm, which is leveraging the divide-and-conquer principle.
