package basicProgram;
import java.util.Scanner;
public class ThreeDArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		System.out.println("Enter the block size: ");
		int block_size=sc.nextInt();
		System.out.println("Enter the row size: ");
		int row_size=sc.nextInt();
		System.out.println("Enter the column size: ");
		int col_size=sc.nextInt();
		int[][][] a=new int[block_size][row_size][col_size];
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.println("Enter a Value: ");
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				for(k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k] + " " );
				}
				System.out.println();
			}
		}
		System.out.println();
	}
}
