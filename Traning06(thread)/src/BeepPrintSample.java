import java.awt.Toolkit;

public class BeepPrintSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Toolkit tk = Toolkit.getDefaultToolkit();
			for(int i = 0; i<5;i++) {
				tk.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			for(int i = 0; i<5;i++) {
				System.out.println("��");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

}
