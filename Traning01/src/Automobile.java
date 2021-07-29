
public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car seltos = new Car();
		seltos.setColor("white");
		System.out.println("색상: "+seltos.getColor());
		seltos.setGuest(3);
		System.out.println("승객수: "+seltos.getGuest());
		seltos.drive(50);
		System.out.println("현재 속도: "+seltos.getSpeed());
		seltos.stop();
		System.out.println("정지후 속도: "+seltos.getSpeed());
	}

}
