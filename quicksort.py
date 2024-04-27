"""Implementation of quick sort in python.
"""

def swap(arr: list, index1: int, index2: int) -> None:
    temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp

def pivot(arr: list, pivot_index: int, end_index: int) -> int:
    swap_index = pivot_index

    for i in range(pivot_index + 1, end_index + 1):
        if arr[i] < arr[pivot_index]:
            swap_index += 1
            swap(arr, swap_index, i)
    swap(arr, swap_index, pivot_index)

    return swap_index

def quicksort_helper(arr: list, left: int, right: int) -> list:
    if left < right:
        pivot_index = pivot(arr, left, right)
        quicksort_helper(arr, left, pivot_index - 1)
        quicksort_helper(arr, pivot_index + 1, right)
    return arr

def quicksort(arr: list) -> list: 
    return quicksort_helper(arr, 0, len(arr) - 1)

if __name__ == "__main__":
    arr = [4, 2, 5, 1, 3, 6]
    print(quicksort(arr))

