package co.edu.abstracts;

public class Main {
	public static void main(String[] args) {
		
		Animal animal = null; // new Animal(); 생성자 호출 불가
		animal = new Bird();
		animal.eat();
		animal.run();
		animal.sleep();
		
		
		animal = new Fish();
		animal.eat();
		animal.run();
		animal.sleep();
	}

}
