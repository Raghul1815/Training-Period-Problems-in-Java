interface Music{
	void play();
}
interface Camera{
	void click();
}

class Smartphone implements Music,Camera{
	public void play() {
		System.out.println("I have been played a song in a Spotify");
	}
	public void click() {
		System.out.println("I have the triple camera setup with 50mp ");
	}
}
public class Interface2 {

	public static void main(String[] args) {
		Smartphone sm = new Smartphone();
		sm.play();
		sm.click();
	}

}
