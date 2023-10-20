package basicProgram;
import java.util.Scanner;
public class EnforcedBoundaries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		int[] a=new int[5];
		int i;
		for(i=0;i<a.length;i++) {
			System.out.println("Enter a Value: ");
			a[i]=sc.nextInt();
		}
	}
}
