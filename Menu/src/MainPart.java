import java.util.Scanner;

public class MainPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu mMenu = new Menu();
		mMenu.init();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("메뉴이름: ");
			String tmpName = s.nextLine();
			
			if(tmpName.isBlank()) {
				mMenu.showMenu();
				break;
			}
			System.out.print("가격: ");
			mMenu.addName(tmpName);
			mMenu.addPrice(Integer.parseInt(s.nextLine()));
		}
		s.close();
	}

}
