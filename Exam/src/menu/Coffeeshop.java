package menu;
import java.io.IOException;
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		//m: �޴�����
		//o: �ֹ��ޱ�
		//s: ��������
		//x: ���α׷� ����
		String inMenu;
		while(true) {
			inMenu = s.nextLine();
			switch(inMenu) {
			case "m":
				manageMenu();
				System.out.println("m");
				break;
			case "o":
				//order();
				System.out.println("o");
				break;
			case "s":
				System.out.println("s");
				break;
			case "x":
				System.out.println("x");
				s.close();
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		}
	}
	
	/*
	 static void order(){
	 	Order order = new Order();
	 	
	 }
	  
	  
	 
	 */
	
	static void manageMenu() {
		Menu menu = new Menu();
		Scanner ms = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("�޴��̸�: ");
			String tmpName = ms.nextLine();
			
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
			System.out.print("����: ");
			menu.addName(tmpName);
			menu.addPrice(Integer.parseInt(ms.nextLine()));
		}
		//ms.close();
	}

//	try {
//	menu.load();
//} catch (IOException e1) {
//	// TODO Auto-generated catch block
//	e1.printStackTrace();
//}

//while(true) {
//	System.out.print("�޴��̸�: ");
//	String tmpName = s.nextLine();
//	
//	if(tmpName.isBlank()) {
//		menu.showMenu();
//		
//		try {
//			menu.save(menu.getName(), menu.getPrice());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		break;
//	}
//	System.out.print("����: ");
//	menu.addName(tmpName);
//	menu.addPrice(Integer.parseInt(s.nextLine()));
//}
//s.close();
}
