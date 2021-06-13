
public class ReverseString {
	public static void main(String args[]) {
		String s1 = "abhinav";
		String s2 = " ";
		//for(int i = s1.length()-1; i>=0; i--) {
		//System.out.print(s1.charAt(i));
		
		int[] numbers = {10,20,30,40};
		for(int i = 0; i<numbers.length;i++) {
			System.out.print(numbers[i] +" ");
		}
		System.out.println();
		
		for(int j = numbers.length-1; j>=0; j--) {
			System.out.print(numbers[j] +" ");
		}
	}

}