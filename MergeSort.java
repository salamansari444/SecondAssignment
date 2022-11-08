package SecondAssignment;

public class MergeSort {
	void mergeSort(int[] arr, int s, int e) {
		if(s>=e) {
			return;
			}
			
		int mid=(s+e)/2;
		mergeSort(arr, s, mid);
		mergeSort(arr, mid+1, e);
		merge(arr,s,mid,e);
		
	}
	
	void merge(int[] arr, int s, int mid, int e){
		int b[]=new int[arr.length];
		int i=s;
		int j=mid+1;
		int k=s;
		
		while(i<= mid && j<=e) {
			if(arr[i]<arr[j]) {
				 b[k]=arr[i];
				i++;
			}
			else {
				arr[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while(j<=e) {
				b[k]=arr[j];
				k++;
				j++;
		}
		while(i<=mid) {
				b[k]=arr[i];
				k++;
				i++;
		}
		
		
		for(k=s; k<=e; k++) {
			arr[k]=b[k];
		}
	}

	public static void main(String[] args) {
		int [] arr= {54,26,93,17,77,31,44,55};
		int n=arr.length;
		System.out.println("Before Sorting");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		MergeSort ms=new MergeSort();
		ms.mergeSort(arr, 0, n-1);
		
		System.out.println();
		System.out.println("After Sorting");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}

	}

}
