package basicProgram;
import java.util.*;
public class HackerRank2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer number:");
		int num=sc.nextInt();
		String str1=Integer.toString(num);
		if(num>=-100&&num<=100) {
			System.out.println("Great Job");
		}
		else {
			System.out.println("Wrong Answer");
		}
	}
}
