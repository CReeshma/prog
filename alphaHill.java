import java.util.Scanner;

public class alphaHill
  {

	public static void main(String[] args) {
		        int n ;
		        Scanner sc=new Scanner(System.in);
		        n=sc.nextInt();
		        char ch = 'A';
		        for (int i = 0; i < n; i++) {
		            for (int j = n - i; j > 1; j--) {
		                System.out.print(" ");
		            }
		            for (int j = 0; j <= i; j++) {
		                System.out.print((char)(ch + j));
		            }
		            for (int j = i - 1; j >= 0; j--) {
		                System.out.print((char)(ch + j));
		            }
		            System.out.println();
		        }
		    }
		}
