

import java.util.Scanner;

public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enetr row number : ");
		int row=sc.nextInt();
		System.out.print("Enter col number : ");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.println("Enter array elements : ");
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array is : ");
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		

	}

}
