abstract class Vehicle{
	String brand;
	int year;
	
	abstract void start();
	Vehicle(String b,int y){
		brand = b;
		year = y;
		System.out.println("Vehicle constructor called");
	}
	void displayInfo() {
		System.out.println("Brand : " + brand);
		System.out.println("Year  : " + year);
	}
}
class Carss extends Vehicle{
	int speed;
	Carss(String b,int y, int s){
		super(b,y);
		speed = s;
		System.out.println("Car constructor has been called");
	}
	void start() {
		System.out.println(brand + " car is starting at speed " + speed + " km/h ");
	}
}
public class Abstraction3 {
	public static void main(String[] args) {
		Carss c = new Carss("Audi",1997,34);
		c.displayInfo();
		c.start();

	}

}
