import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int row_Size=sc.nextInt();
		int col_Size=sc.nextInt();
		int[][] arr1=new int[row_Size][col_Size];
		int[][] arr_temp=new int[col_Size][row_Size];
		for(int i=0;i<row_Size;i++) {
			for(int j=0;j<col_Size;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<col_Size;i++) {
			for(int j=0;j<row_Size;j++) {
				arr_temp[i][j]=arr1[j][i];
			}
		}
		for(int i=0;i<col_Size;i++) {
			for(int j=0;j<row_Size;j++) {
				System.out.print( arr_temp[i][j]);
			}
			System.out.println();
		}
	}
}
