abstract class Animaal{
	abstract void Show();
		
	void Sleep() {
		System.out.println("All the animals are sleeping");
	}
}
class Doggs extends Animaal{
	void Show() {
		System.out.println("Dog says bow bow");
	}
}
class Cats extends Animaal{
	void Show() {
		System.out.println("Cat says meow meow");
	}
}
class Cow extends Animaal{
	void Show() {
		System.out.println("Cow says mow mow");
	}
}
public class Abstraction2 {
public static void main(String[] args) {
	Animaal a;
	 
	a = new Doggs();
	a.Show();
	a.Sleep();
	
	System.out.println();
	
	a = new Cats();
	a.Show();
	a.Sleep();
	
	System.out.println();
	
	a = new Cow();
	a.Show();
	a.Sleep();
}
}
