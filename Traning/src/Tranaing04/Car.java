package Tranaing04;

public class Car {
	Tire frontLeft;
	Tire frontRight;
	Tire backLeft;
	Tire backRight;
	
	Car(){
		this.frontLeft = new Tire("���ʾ�",6);
		this.frontRight = new Tire("�����ʾ�",2);
		this.backLeft = new Tire("���ʵ�",3);
		this.backRight = new Tire("�����ʵ�",4);
	}
	void stop() {
		System.out.println("���� �����߽��ϴ�.");
		
	}
	
	int run() {
		System.out.println("�ڵ����� �޸��ϴ�.");
		if(!this.frontLeft.roll()) {
			stop();
			return 1;
		}
		if(!this.frontRight.roll()) {
			stop();
			return 2;
		}
		if(!this.backLeft.roll()) {
			stop();
			return 3;
		}
		if(!this.backRight.roll()) {
			stop();
			return 4;
		}
		return 0;
	}
}
