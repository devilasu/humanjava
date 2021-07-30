import java.util.Scanner;

public class MainPart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		menu.init();
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("메뉴이름: ");
			String tmpName = s.nextLine();
			
			if(tmpName.isBlank()) {
				menu.showMenu();
				break;
			}
			System.out.print("가격: ");
			menu.addName(tmpName);
			menu.addPrice(Integer.parseInt(s.nextLine()));
		}
		s.close();
	}

}
