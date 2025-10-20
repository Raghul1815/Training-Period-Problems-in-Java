class Animall{
	void sound() {
		System.out.println("Animal makes sound");
	}
}
class Cat extends Animall{
	void sound() {
		super.sound();
		System.out.println("Cat says meoww");
	}
}
class Dogg extends Animall{
	void sound() {
		super.sound();
		System.out.println("Dogs says Boww");
	}
}
public class Runtime_polymorphism {

	public static void main(String[] args) {
		Animall a;
		a = new Cat();
		a.sound();
		
		a = new Dogg();
		a.sound();
		
		System.out.println();
		
//		 (or)
		 
		Animall ac = new Cat();
		ac.sound();
		Animall b = new Dogg();
		b.sound();

	}

}
