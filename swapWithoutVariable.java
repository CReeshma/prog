

import java.util.Scanner;

public class swapWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y values: ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping : "+x+" "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping : "+x+" "+y);
		

	}

}
