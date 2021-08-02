package traning03;

public class Cat extends Animal{
	@Override
	void run() {
		System.out.println("고양이 달리다.");
	}
	@Override
	void sound() {
		System.out.println("고양이 울다.");
	}
}
