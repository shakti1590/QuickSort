package main

import (
	"fmt"
	"math/rand"
)

func main() {
        fmt.Println("Enter size of your array: ")
        var size int
        fmt.Scanln(&size)
        var arr = make([]int, size)
        for i:=0; i<size; i++ {
            fmt.Printf("Enter %dth element: ", i)
            fmt.Scanf("%d", &arr[i])
        }
        fmt.Println("-- Your array before QuickSort --\n\n", arr)
        quicksort(arr)
        fmt.Println("\n-- Array after QuickSort --\n\n", arr, "\n")
}

func quicksort(a []int) []int {
    if len(a) < 2 {
        return a
    }
     
    left, right := 0, len(a)-1
     
    pivot := rand.Int() % len(a)
     
    a[pivot], a[right] = a[right], a[pivot]
     
    for i, _ := range a {
        if a[i] < a[right] {
            a[left], a[i] = a[i], a[left]
            left++
        }
    }
     
    a[left], a[right] = a[right], a[left]
     
    quicksort(a[:left])
    quicksort(a[left+1:])
     
    return a
}
