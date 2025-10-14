
class Student{
	String name;
	int rollno;
	float marks;
	
	Student(){
		name = "unknown";
		rollno = 0;
		marks = 0.0f;
		System.out.println("Default Constructor has been printed");
	}
	Student(String n,int r,float m){
		name = n;
	    rollno = r;
	    marks = m;
	    System.out.println("Parameterized Constructor has been printed");
	}
	void Display() {
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + rollno);
		System.out.println("Marks : " + marks);
		System.out.println();
	}
}

public class Constructor {

	public static void main(String[] args) {
		Student sc = new Student();
		sc.Display();
		Student scs = new Student("Raghul",94,100.0f);
		scs.Display();
	}
}
