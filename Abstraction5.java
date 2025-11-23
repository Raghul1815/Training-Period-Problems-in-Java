abstract class Vehiclee{
String brand;
	Vehiclee(String b){
		brand = b;
		System.out.println("Vehicle Constructor is called");
	}
	abstract void start();
}

class Cares extends Vehiclee{
	int year;
	
	Cares(String b,int y){
		super(b);
		year = y;
		System.out.println("Car Constructor is called");
	}
	void start() {
		System.out.println(brand + " Car started in year " + year);
	}
}
public class Abstraction5 {

	public static void main(String[] args) {
		Cares cc = new Cares("BMW",1997);
		cc.start();

	}

}
