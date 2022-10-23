#include<iostream>
using namespace std;

void quick(int a[],int low,int high)
    {
        int left=0,right=6,pivot=(low+high)/2;
        
        if(low>=high)
        {
            return;
        }
        while(left<=right)
        {
            while(a[left]<a[pivot])
            left++;
            
            while(a[right]>a[pivot])
            right--;
            
            if(left<=right)
            {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++; 
                right--;
            }
        }
        quick(a,low,right);
        quick(a,left,high);
    }

int main()
{
    int arr[]={2,7,9,0,4,5,3};
		quick(arr,0,6);
		for(int i=0;i<7;i++)
		{
		    cout<<arr[i]<<", ";
		}
	return 0;
}
