class Name{
	
 void show(int age,String name)	{
	 System.out.println("Age of me : " + age + " Name : " + name);
 }
 void show(String name, int age) {
	 System.out.println("Name of her : " + name + " Age : " + age);
 }
}
public class Compiletime_polymorphism2 {

	public static void main(String[] args) {
		Name n = new Name();
		n.show("Pavithra",19);
		n.show(19, "Raghul");

	}

}
