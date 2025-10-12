package DailyPractive;
class Tailor{
	String name;
	int no;
	char gender;
	
	Tailor(){
		name = "Raghul";
		no = 1234567890;
		gender = 'M';
		System.out.println("Default");
	}
	
	Tailor(String n,int nr,char g){
		name = n;
		no = nr;
		gender = g;
		System.out.println("Parameterized");
		
	}
	void Details(){
		System.out.println("Name : " + name);
		System.out.println("Number : " + no);
		System.out.println("Gender : " + gender);
		System.out.println();
	}
}
public class Day_02 {
	public static void main(String[] args) {
		Tailor tr = new Tailor();
		tr.Details();
		Tailor trs = new Tailor("Pavithra",123456,'F');
		trs.Details();
  
	}
}
