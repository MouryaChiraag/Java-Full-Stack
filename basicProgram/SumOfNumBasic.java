package basicProgram;
import java.util.Scanner;
public class SumOfNumBasic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		System.out.println("Enter the vslue of b: ");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Sum of "+ a +" and " + b + "= " + c);
	}
}
