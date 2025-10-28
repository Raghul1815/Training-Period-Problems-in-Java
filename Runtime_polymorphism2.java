class Animals{
	Animals() {
		System.out.println("Animal makes the sound");
	}
}
class Doggg extends Animals{
	Doggg() {
		super();
		System.out.println("Dog says boww");
	}
	
}
public class Runtime_polymorphism2 {

	public static void main(String[] args) {
    Doggg d = new Doggg();
	}
}
