

public class Cat extends Animal{
	String eyeColor;
	
	Cat(){
		this.eyeColor = "brown";
	}
	void getEyeColor() {
		System.out.println(this.eyeColor);
	}
	@Override
	void run() {
		System.out.println("����� �޸���.");
	}
	@Override
	void sound() {
		System.out.println("����� ���.");
	}
}
