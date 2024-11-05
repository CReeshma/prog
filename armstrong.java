

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number in 3 digits : ");
		int n=sc.nextInt();
		int oriNumber=n;
		int res=0;
		while(n!=0) {
			int dig=n%10;
			res+=dig*dig*dig;
			n/=10;
		}
		if(res==oriNumber) {
			System.out.println(oriNumber+" is an armstrong number");
		}
		else {
			System.out.println(oriNumber+" is not an armstromg number");
		}
				

	}

}
