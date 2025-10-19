class Person{
	String name;
	int age;
	Person(String n,int a){
		name = n;
		age = a;
		System.out.println("Parent constructor is called");
	}
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
class Employeee extends Person{
	int empId;
	double salary;
	
	Employeee(String n, int a,int e,double s){
		super(n,a);
		empId = e;
		salary = s;
	System.out.println("Child constructor is called");
	}
	
	void display() {
		super.display();
		System.out.println("Employee Id : " + empId);
		System.out.println("Salary : " + salary);
		
	}
}
public class Inheritance_Constructor {
public static void main(String[] args) {
	Employeee emp= new Employeee("Raghul",19,94,50000.00d);
	emp.display();
	
}
}
