package basicProgram;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,sum,temp,digit,count;
		System.out.println("Enter the Number:");
		num =sc.nextInt();
		temp=num;
		sum=0;
		while(num!=0) {
			digit=num%10;
			sum=sum+(digit*digit*digit*digit);//this line is wrong
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+"Is a Armstrong Number");
		}
		else {
			System.out.println(temp+"Is not a Armstrong Number");
		}
	}

}
