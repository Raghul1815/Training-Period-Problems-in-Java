
abstract class Shape{
	abstract double area();
	
	void displayShape() {
		System.out.println("This is a shape");
	}
}
class Circle extends Shape{
	double radius;
	
	Circle(double r){
		radius = r;	
	}
	double area() {
		return Math.PI * radius * radius;
	}
}
class Rectangle extends Shape{
	double length,width;
	
	Rectangle(double l,double w){
		length = l;
		width = w;
	}
	double area() {
		return length * width;
	}
}
public class Abstraction4 {

	public static void main(String[] args) {
		Shape cc;
		
		cc = new Circle(2);
		cc.displayShape();
		System.out.println(cc.area());
		System.out.println();
		cc = new Rectangle(3,4);
		cc.displayShape();
		System.out.println(cc.area());
		
		System.out.println();
		System.out.println();	
//		(or)
		Shape c = new Circle(23);
		Shape r = new Rectangle(2,3);
	
		c.displayShape();
		System.out.println("Circle area: " + c.area());
        System.out.println();
        
        r.displayShape();
        System.out.println("Rectangle area: " + r.area());
	}

}
