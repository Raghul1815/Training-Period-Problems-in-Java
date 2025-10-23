interface Mobile{
	void phone();
}
interface Cameras extends Mobile{
	void model();
}
class Phone implements Cameras{
	public void phone() {
		System.out.println("Ithuthan daw mobile");
	}
	public void model() {
		System.out.println("Ithuthan daw Camera");
	}
}
public class Interface3 {
public static void main(String[] args) {
	Phone cc = new Phone();
	cc.phone();
	cc.model();
}
}
