class Animal{
	void eat() {
		System.out.println("Animal is eating!!");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Animal is barking!!");
	}
}
public class Normal_inheritance {
	public static void main(String[] args) {
		Dog ani = new Dog();
		ani.eat();
		ani.bark();
	}

}
