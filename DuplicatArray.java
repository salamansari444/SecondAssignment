package SecondAssignment;
import java.util.*;


public class DuplicatArray {

	public static void main(String[] args) {
		

		
		int[] arr= {2,4,2,5,6,2,4,8,8,1,2};
		int n=arr.length;
		System.out.println("Duplictae Element in Array");
		//dupliacte operation 4 5 6 7 8 4 3
		for(int i=0; i<n;i++) {
			for(int j=i+1; j<n; j++) {
			if(arr[i]==arr[j]) {
				System.out.print(arr[j]+" ");
				break;
			}
			
			}
		}
		
	
		
	}

}
