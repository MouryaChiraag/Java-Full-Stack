package basicProgram;
import java.util.Scanner;
public class VowelsConsonants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int vowel=0;
		char ch;
		int cons=0;
		System.out.println("Enter a String:");
		String str= sc.next();
		int l=str.length()-1;
		for(i=0;i<=l;i++) {
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
				System.out.println("Number of vowels are  " + ch+"");
			}
			else {
				cons++;
			}
		}
		System.out.println("Number of Vowels are  "+vowel);
		System.out.println("Number of Consonants are  "+cons);
	}
}