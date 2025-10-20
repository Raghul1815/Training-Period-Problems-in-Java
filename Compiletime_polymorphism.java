class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	double add(double a,double b,double c) {
		return a+b+c;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
}
public class Compiletime_polymorphism {
public static void main(String[] args) {
	Calculator calc = new Calculator();
	System.out.println(calc.add(1, 2));
    System.out.println(calc.add(1.11d, 2.22f, 3.333d));
    System.out.println(calc.add(1, 22, 3));
}
}
