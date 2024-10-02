package assignment02Oct;

class A{
	public static void print() {
		System.out.println("Parent");
	}
}

class B extends A{
	public static void print() {
		System.out.println("Child");
	}
}


public class TestAandB {

	public static void main(String[] args) {
		
		A obj = new B();
		obj.print();

	}

}
