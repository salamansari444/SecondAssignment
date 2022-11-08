package SecondAssignment;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] ar= {7,5,8,3,2,1,4,6,9};
		int temp=0;
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
				 temp= ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		
		for(int ele:ar) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}

}
