interface Animala{
	void sound();
	void sleep();
}
class Dods implements Animala{
	public void sound() {
		System.out.println("Dog's says Bow Bow!!");
	}
	public void sleep() {
		System.out.println("Dogs will sleep at night");
	}
}
public class Interface1 {

	public static void main(String[] args) {
	Dods dd = new Dods();
	dd.sound();
	dd.sleep();
	}

}
