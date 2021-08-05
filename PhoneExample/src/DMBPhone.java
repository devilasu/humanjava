
public class DMBPhone extends Phone{

	public DMBPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void turnOn() {
		System.out.println("DMB폰을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("DMB폰을 끕니다.");
	}
	
}
