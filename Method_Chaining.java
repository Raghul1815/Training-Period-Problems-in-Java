package DailyPractive;
class Tailerss{
	String name;
	int size;
	char gender;
	
	Tailerss(){
		this("Raghul",95,'M');
		System.out.println("Default Constructor");
	}	
	Tailerss(String n,int s,char g){
		name = n;
		size = s;
		gender = g;
		System.out.println("Parameterized Constructor");
	}
	Tailerss setName(String n){
		this.name = n;
		return this;
	}
	Tailerss setSize(int s) {
		this.size = s;
		return this;
	}
	Tailerss setGender(char g) {
		this.gender = g;
		return this;
	}
		void Show() {
			System.out.println("Name : " + name);
	        System.out.println("Size : " + size);
	        System.out.println("Gender : " + gender);
	        System.out.println();
	}
}
public class MethodChaining {
public static void main(String[] args) {
	Tailerss tr = new Tailerss();
	tr.setName("Pavithra").setSize(90).setGender('F');
	tr.Show();
	
	Tailerss trs = new Tailerss("Raghul",95,'M');
	trs.setName("Albe").setSize(90);
	trs.Show();	
}
}
