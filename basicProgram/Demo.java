package basicProgram;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size, sumOfEven=0,sumOfOdd=0;
		System.out.println("Enter the size of elements:");
		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter elements of Array:");
		for (int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for (int i=0;i<size;i++) {
			if(a[i]%2==0) {
				sumOfEven=sumOfEven+a[i];
			}
			else {
				sumOfOdd=sumOfOdd+a[i];
			}
		}
		System.out.println("Sum of Even Numbers are: " + sumOfEven);
		System.out.println("Sum of Entered Odd Numbers are: " + sumOfOdd);
	}
}
