package basicProgram;
import java.util.Scanner;
public class MaxMinValue {
	public static void main(String[] args) {
		int a[]=new int[] {4,3,2,5,8,9,12,3};
		int l=a[0];
		int s=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>l)l=a[i];
			else if(a[i]<s)s=a[i];
		}
		System.out.println("The Max value of the array is:"+l);
		System.out.println("The Min value of the array is:"+s);
	}
}
