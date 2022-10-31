// Java implementation of QuickSort

import java.io.*;
import java.util.*;

class quicksort {

	//  Always pick first element as pivot
	//function for swap
	static void swap(int[] arr, int i, int j)
	{
		//swap
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//find the partition index
	static int partition(int[] arr, int s, int e)
	{

		//Here we pick a pivot that will be used for partition ahead
		
		int pivot = arr[e];
		int i = (s - 1);

		for (int j = s; j <= e - 1; j++) {

			// If current element is smaller
			// than the pivot
			if (arr[j] < pivot) {

				// Increment index of
				// smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1,e);
		return (i++); 
	}

	//function for quick sort
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

	// method to print an array
	static void printArray(int[] arr, int size)
	{
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	// Driver Code
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);  
		int p=sc.nextInt();
		// dynamic allocating the memory to array.
		int[] arr = new int[10];  
		for(int i=0; i<p; i++)  
        	{  
            	arr[i]=sc.nextInt();  
        	}
		quickSort(arr, 0, p - 1);
		System.out.println("Sorted array: ");
		printArray(arr, p);
	}

