package Tranaing04;

public class Tire {
	int maxRotation;	//����(�ִ� ȸ����)
	int accRotation;	//����ȸ����
	String location;
	
	Tire(String loc, int maxRoc){
		this.location = loc;
		this.maxRotation = maxRoc;
	}
	boolean roll() {
		++this.accRotation;
		if(this.accRotation>this.maxRotation) {
			System.out.println(this.location+" Tire ���� ����"+(this.maxRotation-this.accRotation));
			return true;
		}else {
			System.out.println(this.location+" Tire ��ũ");
			return false;
		}
	}
}
