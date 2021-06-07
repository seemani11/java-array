package tutoring;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int[] array = new int[5];
	Scanner input = new Scanner(System.in);

	for(int i = 0; i<array.length; i++) {
		array[i] = input.nextInt();
		
	}
	System.out.println("enter your number");
	//int sum = 0;
	int num=input.nextInt();
	for(int i = 0;i<array.length; i++) {
			if(num == array[i]) { 
			//sum = sum +array[i];
				
	System.out.println("yes number is inside the array");
			}
		}
		System.out.println("no");
	}
	}
 

