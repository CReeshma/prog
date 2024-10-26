

import java.util.Scanner;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter table number : ");
		int n=sc.nextInt();
		System.out.println("Enter upto : ");
		int m=sc.nextInt();
		for(int i=1;i<=m;i++) {
			System.out.println(n +" * "+i+" = "+n*i );
		}

	}

}
