package menu;
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
