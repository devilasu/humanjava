
public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl tv=new Television();
		tv.turnOn();
		tv.setVolume(7);
		tv.setMute(true);
		tv.turnOff();
		RemoteControl.changeBattery();
		
		RemoteControl audio = new Audio();
		audio.turnOn();
		audio.setVolume(5);
		audio.setMute(true);
		audio.turnOff();
		
	}

}
