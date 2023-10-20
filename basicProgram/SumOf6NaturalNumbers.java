package basicProgram;
import java.util.Scanner;
public class SumOf6NaturalNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int i, sum=0;
		System.out.println("The first " + n + " natural numbers are: ");
		for(i=1;i<=n;i++) {
			System.out.println(i + "");
			sum=sum + i;
		}
		System.out.println();
		System.out.println("The sum of first " + n + " Natural numbers are: " + sum);
	}
}
