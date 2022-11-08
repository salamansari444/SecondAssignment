package SecondAssignment;


public class QuickSort {
	void quickSort(int [] arr, int s, int e) {
		if(s>=e) {
			return;
		}
		int p=partition(arr, s, e);
		
		//left side sort
		quickSort(arr, s, p-1);
		
		//right side sort
		quickSort(arr, p+1, e);
	}
	
	int partition(int []arr, int s , int e) {
		int pivot=arr[s];
		int count=0;
		for(int i=s+1; i<=e; i++) {
			if(arr[i]<=pivot) {
				count++;
			}
			}
		
		int pivotIndex = s+count;
		swap (arr,  pivotIndex , s);
		// left and right position
		int i=s;
		int j=e;
		while(i < pivotIndex && j> pivotIndex) {
			while(arr[i] <pivotIndex) {
				i++;
				}
			while(arr[j]>pivotIndex) {
				j--;
			}
			if(i < pivotIndex && j> pivotIndex) {
				swap(arr, i, j);
			}
			}
		return pivotIndex;
	}
	
	
	
	void swap (int[] arr, int s , int e){
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
	}
	public static void main(String[] args) {
		int [] arr= {3,5,2,1,7,0,9}; 
		int n=arr.length;
		
		QuickSort q=new QuickSort();
		
		q.quickSort( arr, 0,n-1);
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		
	}

}
