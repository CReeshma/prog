

import java.util.Scanner;

public class oneDArray {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no.of elements in array : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter arrray elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
	}

}
