package traning02;

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
		
		Car avante = new Car("gray white",5,280,30);
		System.out.println(avante.getColor());
		System.out.println(avante.getGuest());
		System.out.println(avante.getMaxSpeed());
		System.out.println(avante.getnSpeed());
		System.out.println();
		
		Car grandeur = new Car("black",5,320,50,"Grandeur",4);
		System.out.println(grandeur.getColor());
		System.out.println(grandeur.getGuest());
		System.out.println(grandeur.getMaxSpeed());
		System.out.println(grandeur.getnSpeed());
		System.out.println(grandeur.getModelName());
		System.out.println(grandeur.getWheel());
	}
}
