package basicProgram;
import java.util.Scanner;
public class ImmutableDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.next();
		System.out.println(s.length());
		System.out.println(s.charAt(4));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(6));
		System.out.println(s.substring(6,13));
		System.out.println(s.contains("Mourya"));
		System.out.println(s.startsWith("Mourya"));
		System.out.println(s.endsWith("Mourya"));
		System.out.println(s.isEmpty());
		System.out.println(s.concat("is a Genius"));
	}
}
