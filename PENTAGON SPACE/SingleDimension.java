import java.util.Scanner;
class SingleDimension 
{
	public static void main(String[] args) 
	{
		// to create and print 1d array
        
		//declaration of an array
		int a[];
		a=new int[5];

		//initialization
		//to the index position where the value is not set,
		//internally it takes default values with to the declared
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[4]=40;
		a[3]=50;

		//utilization
		System.out.println(a[3]);
	}
}
//if you need other datatype, add float a[];
//a=new float[5];