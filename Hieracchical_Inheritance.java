class Personnn{
	String name; 
	int age;
	
	Personnn(String n,int a){
		name = n;
        age = a;
        System.out.println("Parent Constructor called");
	}
	void Display() {
		System.out.println("Name :"+ name);
		System.out.println("Age : " + age);
	}
}
class Employeeee extends Personnn{
	int id;
	double salary;
	Employeeee(String n,int a,int i,double s){
		super(n,a);
		id = i;
		salary = s;
		System.out.println("Child Constructor called");
	}
	void show() {
		Display();
		System.out.println();
		System.out.println("Employee Id : " + id);
		System.out.println("Salary of the Employee : " + salary);
		System.out.println();
	}
}
class Managerr extends Personnn{
	String department;
	
	Managerr(String n,int a,String d){
		super(n,a);
		department = d;
		System.out.println("Child Constructor called");
	}
	void show() {
		Display();
		System.out.println();
		System.out.println("Department of the Employees : " + department);
		System.out.println();
	}
}

public class Inheritance_Hierarchical {
public static void main(String[] args) {
	Employeeee em = new Employeeee("Raghul",19,94,50000.00d);
	Managerr mm = new Managerr("Bhava Harini",20,"Hr");
	System.out.println();
	em.show();
	mm.show();
}
}
