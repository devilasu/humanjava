

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
		System.out.println("고양이 달리다.");
	}
	@Override
	void sound() {
		System.out.println("고양이 울다.");
	}
}
