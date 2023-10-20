package basicProgram;
class Student{
	String name;
	int age;
	boolean isMarried;
	float height;
}
public class LvAndIv {
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
		Student s=new Student();
		System.out.print(s.name + ' ' + s.age + ' ' + s.isMarried + ' ' + s.height );
	}
}
