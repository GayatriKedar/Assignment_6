package Assignment_6;

abstract class GeometricShape{
	
	final double PI=3.14;
	
	abstract public void area();
	abstract public void perimeter();	
}

class Circle extends GeometricShape{

	public void area() {
		int r=5;
		double area1 = 2*PI*r*r;
		System.out.println("Area of circle : "+area1);
		
	}
	public void perimeter() {
		
		int r=5;
		double area1 = 2*PI*r;
		System.out.println("Perimeter of circle :"+2*3.14*5);
	}	
}

class Rectangle extends GeometricShape{

	public void area() {		
		int l=3,b=5;
		System.out.println("Area of Rectangle : "+l*b);
	
	}

	public void perimeter() {
		
		int l=5,b=2;
		System.out.println("Perimeter of Rectangle : "+2*(l+b));	
	}
}

class Triangle extends GeometricShape{

	public void area() {
	
		int b=5,h=2;
		double area2 = 0.5*b*h;
		System.out.println("Area of Rectangle : "+area2);
		
		
	}
	public void perimeter() {
		
		int a=5,b=2,c=6;
		System.out.println("Perimeter of Rectangle : "+a+b+c);
	}
	
}

public class TestGeometricshape {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.area();
		circle.perimeter();
		
		System.out.println("===================");
		
		Rectangle rectangle = new Rectangle();
		rectangle.area();
		rectangle.perimeter();
		
		System.out.println("===================");
		
		Triangle triangle = new Triangle();
		triangle.area();
		triangle.perimeter();



	}

}
