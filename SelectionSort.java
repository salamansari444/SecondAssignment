package SecondAssignment;

public class SelectionSort {
	void selectionSort(int[] arr, int n){
		for(int i=0; i<n; i++) {
			int minIndex=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[minIndex])
					minIndex=j;
					
			}
			swap(arr,minIndex, i);
		}
	}
	void swap(int [] arr, int minIndex, int j) {
	
	int temp=arr[minIndex];
	arr[minIndex]=arr[j];
	arr[j]=temp;
	
	}
	public static void main(String[] args) {
		int [] arr= {5,2,3,1};
		int n=arr.length;
		 SelectionSort ss=new SelectionSort();
		 ss.selectionSort(arr, 4);
		 for(int i=0; i<n; i++) {
		 System.out.print(arr[i]+" ");
		 }

		
	}
}
