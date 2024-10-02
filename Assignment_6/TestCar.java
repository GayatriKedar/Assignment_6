package assignment02Oct;

class Engine{
	public void start() {
		System.out.println("Start engine");
	}
	
	public void stop() {
		System.out.println("Stop engine");
	}
	
	public void display() {
		start();
		stop();
	}
}

class Car extends Engine{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}



public class TestCar {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine();
		engine.display();
		
	}

}
