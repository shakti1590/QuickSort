#include <bits/stdc++.h>
using namespace std;

int partition(int arr[], int s, int e)
{

	int pivot = arr[s];

	int count = 0;
	for (int i = s + 1; i <= e; i++) {
		if (arr[i] <= pivot)
			count++;
	}

	// Giving pivot element its correct position
	int pivotIndex = s + count;
	swap(arr[pivotIndex], arr[s]);

	// Sorting left and right parts of the pivot element
	int i = s, j = e;

	while (i < pivotIndex && j > pivotIndex) {

		while (arr[i] <= pivot) {
			i++;
		}

		while (arr[j] > pivot) {
			j--;
		}

		if (i < pivotIndex && j > pivotIndex) {
			swap(arr[i++], arr[j--]);
		}
	}

	return pivotIndex;
}

void quickSort(int arr[], int s, int e)
{

	// base case
	if (s >= e)
		return;

	// partitioning the array
	int p = partition(arr, s, e);

	// Sorting the left part
	quickSort(arr, s, p - 1);

	// Sorting the right part
	quickSort(arr, p + 1, e);
}

void printArray(int arr[],int n){
    
    for(int i =0 ;i<n;i++){
        
        cout<<arr[i]<<" ";
        
    }
    cout<<endl;
}

int main()
{

	int arr[] = { 8, 3, 6, 2, 1, 9 };
	int n = 6;

	quickSort(arr, 0, n - 1);
    printArray(arr,n);
	
	return 0;
}
