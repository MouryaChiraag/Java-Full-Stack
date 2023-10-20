package basicProgram;
import java.util.*;
public class PersonArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		Person[] p=new Person[size];
		for(i=0;i<p.length;i++) {
			p[i]=new Person();
			System.out.println("Enter a name: ");
			p[i]=sc.next();
			System.out.println("Enter the age: ");
			p[i]=sc.nextInt();
		}
		for(i=0;i<p.length;i++) {
			System.out.println("Person Name: " + p[i].name + "Person age: " + p[i].age);
		}
	}
}
