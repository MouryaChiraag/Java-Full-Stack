package basicProgram;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: " );
		int n=sc.nextInt();
		int sum=0, r=0, num=n;
		while(n!=0) {
			r=n%10;
			sum=sum + r;
			n=n/10;
		}
		System.out.println("Thes sum of digits of " + num + " = " + sum);
	}
}
