package traning04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		for(int i = 0; i<=5;i++) {
			int punkTire = car.run();
			switch(punkTire) {
			case 1:
				System.out.println("���� �� ��ũ");
				break;
			case 2:
				System.out.println("������ �� ��ũ");
				break;
			case 3:
				System.out.println("���� �� ��ũ");
				break;
			case 4:
				System.out.println("������ �� ��ũ");
				break;
			}
			if(punkTire!=0)
				break;
		}
	}

}
