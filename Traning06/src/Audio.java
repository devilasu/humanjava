
public class Audio implements RemoteControl {
	private int _volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume>RemoteControl.MAX_VOLUME) {
			this._volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this._volume=RemoteControl.MIN_VOLUME;
		}else {
			this._volume=volume;
		}
		System.out.println("����Audio����: "+this._volume);
	}
}
