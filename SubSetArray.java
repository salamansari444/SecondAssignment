package SecondAssignment;

public class SubSetArray {
	static boolean subSet(int arr1[], int arr2[],int m, int n) {
		int i=0;
		int j=0;
		for( i=0; i<n; i++) {
			for( j=0; j<m; j++) {
				if(arr2[i]==arr1[j])
					break;
			}
				if(j==m)
					return false;
			
			}
		return true;
		}

	public static void main(String[] args) {
		int m,n;
		int arr1[]= {20,10,50};
		int arr2[]= {20,10,50,60,34,57,23};
		m=arr1.length;
		n=arr2.length;
		if(subSet(arr1,arr2,m,n)) {
			System.out.println("Array 2 is subset of Array 1 ");
		}
		else {
			System.out.println("Array 1 is subset of Array 2 ");
		}

	}

}
