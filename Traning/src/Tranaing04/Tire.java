package Tranaing04;

public class Tire {
	int maxRotation;	//수명(최대 회전수)
	int accRotation;	//현재회전수
	String location;
	
	Tire(String loc, int maxRoc){
		this.location = loc;
		this.maxRotation = maxRoc;
	}
	boolean roll() {
		++this.accRotation;
		if(this.accRotation>this.maxRotation) {
			System.out.println(this.location+" Tire 남은 수명"+(this.maxRotation-this.accRotation));
			return true;
		}else {
			System.out.println(this.location+" Tire 펑크");
			return false;
		}
	}
}
