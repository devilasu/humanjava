

public class Animal {
	int eye_count;
	int feet_count;
	
	Animal(){
		this.eye_count = 2;
		this.feet_count = 4;
	}
	
	void run() {
		System.out.println("Animal 달린다.");
	}
	void sound() {
		System.out.println("Animal 소리낸다.");
	}
}
