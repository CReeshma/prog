

import java.util.Scanner;

public class swapWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y values: ");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("Before Swapping 2: "+x+" "+y);
		
		z=x;
		x=y;
		y=z;
		System.out.println("After Swapping : "+x+" "+y);
		

	}

}
