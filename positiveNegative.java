

import java.util.Scanner;

public class positiveNegative {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value: ");
		int t=sc.nextInt();
		if(t>=0) {
			System.out.println("Positive number");
		}
		else {
			System.out.println("Negative number");
		}
	}

}
