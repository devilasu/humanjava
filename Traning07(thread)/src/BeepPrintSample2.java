
public class BeepPrintSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runnable beepTask = new BeepTask();
		Thread t = new BeepTask();//Thread(beepTask);
		t.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}