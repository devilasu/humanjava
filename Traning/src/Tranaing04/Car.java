package Tranaing04;

public class Car {
	Tire frontLeft;
	Tire frontRight;
	Tire backLeft;
	Tire backRight;
	
	Car(){
		this.frontLeft = new Tire("왼쪽앞",6);
		this.frontRight = new Tire("오른쪽앞",2);
		this.backLeft = new Tire("왼쪽뒤",3);
		this.backRight = new Tire("오른쪽뒤",4);
	}
	void stop() {
		System.out.println("차가 정지했습니다.");
		
	}
	
	int run() {
		System.out.println("자동차가 달립니다.");
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
