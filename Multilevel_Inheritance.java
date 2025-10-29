


class Personn{
	String name;
	int age;
	
	Personn(String n,int a) {
		name  = n;
		age = a;
		System.out.println("Person constructor called");
	}
	void Display() {
		System.out.println("Name :"+ name);
		System.out.println("Age : " + age);
	}
}
class Employee extends Personn{
	
	int empId;
	double salary;
	
	Employee(String n, int a,int e,double s){
		super(n,a);
		empId =e;
		salary = s;
		System.out.println("Employee constructor called");
	}
	void Display(){
		super.Display();
		System.out.println("Employee Id : " + empId);
		System.out.println("Salary of the Employee : " + salary);
	}
}
class Manager extends Employee{
	String department;
	
	Manager(String n,int a, int e, double s ,String d){
		super(n,a,e,s);
		department = d;
	}
	void Display() {
		super.Display();
		System.out.println("Department of the Employees : " + department);
	}
}
public class Multilevel_Inheritance {
	public static void main(String[] args) {
		Manager m = new Manager("Raghul",19,94,50000.00d,"HR");
		System.out.println();
		System.out.println("This is the final output");
		m.Display();
	}
}
