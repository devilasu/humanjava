
public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car seltos = new Car();
		seltos.setColor("white");
		System.out.println("����: "+seltos.getColor());
		seltos.setGuest(3);
		System.out.println("�°���: "+seltos.getGuest());
		seltos.drive(50);
		System.out.println("���� �ӵ�: "+seltos.getSpeed());
		seltos.stop();
		System.out.println("������ �ӵ�: "+seltos.getSpeed());
	}

}
