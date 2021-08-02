package traning02;
import java.util.ArrayList;

public class Car {
	private String color;
	private int maxSpeed;
	private int nSpeed;
	private int guest;
	private String modelName;
	private int wheel;
	private ArrayList<Integer> dailyRun;
	
	Car(){
//		this.color = "blue";
//		this.maxSpeed = 240;
//		this.nSpeed=0;
//		this.guest = 5;
//		this.dailyRun = new ArrayList<Integer>();
		this("blue",5,240,0);
	}
	
	
	public Car(String color, int maxSpeed, int nSpeed, int guest) {
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.nSpeed = nSpeed;
		this.guest = guest;
	}

	public Car(String color, int maxSpeed, int nSpeed, int guest, String modelName, int wheel) {
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.nSpeed = nSpeed;
		this.guest = guest;
		this.modelName = modelName;
		this.wheel = wheel;
	}


	void drive(int curSpeed) {
		this.nSpeed=curSpeed;
	}
	void stop() {
		this.nSpeed=0;
	}
	int getSpeed() {
		return this.nSpeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getnSpeed() {
		return nSpeed;
	}
	public void setnSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	public int getGuest() {
		return guest;
	}
	public void setGuest(int guest) {
		this.guest = guest;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public ArrayList<Integer> getDailyRun() {
		return dailyRun;
	}
	public void setDailyRun(ArrayList<Integer> dailyRun) {
		this.dailyRun = dailyRun;
	}
	
}
