package basicProgram;
import java.util.Scanner;
public class DuckNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number:");
		String num=sc.next();
		if(num.charAt(0)=='0') {
			System.out.println(num + "is not a duck number");
		}
		else if(num.contains("0")) {
			System.out.println(num + "is a duck number");
		}
		else {
			System.out.println(num + "is not a duck number");
		}
	}
}
