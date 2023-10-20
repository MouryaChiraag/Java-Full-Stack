class Employee{
	String name="Mourya";
	int age=21;
	int salary=100000;
	void work(){
		System.out.println("Employee is working");
	}
}
class EmployeeApp{
	public static void main(String args[]){
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3,e4,e5,e6,e7;
		e3=e1;
		e4=e1;
		e5=e4;
		e6=e2;
		e7=e6;
		System.out.println(e1.name);
		System.out.println(e2.name);
		System.out.println(e3.name);
		System.out.println(e4.name);
		System.out.println(e5.name);
		System.out.println(e6.name);	
		System.out.println(e7.name);
	}
