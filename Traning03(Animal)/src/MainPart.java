

public class MainPart {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		System.out.println("´«: "+animal.eye_count);
		System.out.println("¹ß: "+animal.feet_count);
		animal.run();
		animal.sound();
		
		Human nin = new Human();
		
		System.out.println("ÀÎ°£ ´«: "+nin.eye_count);
		System.out.println("ÀÎ°£ ¹ß: "+nin.feet_count);
		nin.run();
		nin.sound();
		nin.study();
		
		Cat cat = new Cat();
		cat.run();
		cat.sound();
		
	}
}
