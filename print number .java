

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}

	}

}
