class Student{
	String name="Mourya";
	int age=21;
	int marks=67;
	void study(){
		System.out.println("Student is studying");
	}
}
class StudentApp{
	public static void main(String args[]){
		Student s1=new Student();
		Student s2=new Student();
		System.out.println("Before change output is:");
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.marks);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.marks);
		s2.name="Chiraag";
		s2.age=22;
		s2.marks=97;
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.marks);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.marks);
		System.out.println(s1);
		System.out.println(s2);
	}
}
