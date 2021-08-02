package menu;
import java.io.IOException;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		Scanner s = new Scanner(System.in);
		
		try {
			menu.load();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		while(true) {
			System.out.print("메뉴이름: ");
			String tmpName = s.nextLine();
			
			if(tmpName.isBlank()) {
				menu.showMenu();
				try {
					menu.save(menu.getName(), menu.getPrice());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			System.out.print("가격: ");
			menu.addName(tmpName);
			menu.addPrice(Integer.parseInt(s.nextLine()));
		}
		s.close();
	}

}
