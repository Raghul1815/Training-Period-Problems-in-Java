

class Car{
	String brand;
	String model;
	int price;

void showDetails() {
	System.out.println("Brand : "+brand);
	System.out.println("Model : "+model);
	System.out.println("Price : "+price);
	System.out.println();
}
}
public class Classes_Objects {

	public static void main(String[] args) {
      Car Audi = new Car();
      Audi.brand = ("Audi");
      Audi.model = "2006 Model";
      Audi.price = 123456;
      Audi.showDetails();
      
      Car BMW = new Car();
      BMW.brand = "BMW";
      BMW.model = "2007 model";
      BMW.price = 123456;
      BMW.showDetails();
}
}
