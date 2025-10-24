
interface Mobiless{
	void camera();
	void music();
}

abstract class Device{
	abstract void powerOn();
	void charging() {
		System.out.println("mobile is charging");
	}
}
class Smartphones extends Device implements Mobiless{
	public void camera(){
		System.out.println("This is the camera in mobile");
	}
	public void music() {
		System.out.println("We can also play the music in the mobile phone too");
	}
	void powerOn() {
		System.out.println("This is the Power on symbol");
	}
}
public class Interface4 {
public static void main(String[] args) {
	Smartphones sms = new Smartphones();
	sms.camera();
	sms.music();
	sms.charging();
	sms.powerOn();
}
}
