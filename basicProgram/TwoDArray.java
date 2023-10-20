package basicProgram;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, j;
		System.out.println("Enter the row_size: ");
		int row_size=sc.nextInt();
		System.out.println("Enter the column_size: ");
		int column_size=sc.nextInt();
		int[][] a=new int[row_size][column_size];
		for(i=0;i<a.length;i++) {
			for(j=0;j<a[i].length;j++) {
				System.out.println("Enter a value: ");
				a[i][j]=sc.nextInt();
			}
		}
			for(i=0;i<a.length;i++) {
				for(j=0;j<a[i].length;j++) {
				System.out.print(a[i][j] + " " );
				}
		}
	}
}
