package tutoring;

public class ArrayLearning {
	public static void main(String args []) {
		/*
		 * create an int array of size 5
		 * populate the array with values
		 * using a forloop print the contents of array
		 * usning another forloop print array in reverse order
		 * 
		 * */
		
		
		
		int[]  arr= {10, 20, 30,40,50};
		//printing contents of array
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] +" ");
			
		}
		
		System.out.println();
		
		// reversing the arrayS
		for(int i = arr.length-1;i>=0; i--) {
			System.out.print(arr[i] +" ");
		}
		
		
		
		
	}
}
