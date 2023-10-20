package basicProgram;
import java.util.Scanner;
public class OneDArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the size: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(i=0;i<a.length;i++) {
			System.out.println("Enter a value: ");
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++) {
			System.out.print(a[i] + " " );
		}
	}
}
