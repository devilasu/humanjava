
import java.util.Scanner;

public class Coffeeshop {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		//m: �޴�����
		//o: �ֹ��ޱ�
		//s: ��������
		//x: ���α׷� ����
		String inMenu;
		while(true) {
			System.out.println("�۾��� �����ϼ��� (m:�޴�����, o:�ֹ�����, s:��������, x:���α׷�����)");;
			
			inMenu = sc.nextLine();
			switch(inMenu) {
			case "m", "M":
				System.out.println("�޴�����");
				String inManageMenu;
				do{
					System.out.println("�޴��۾��� �����ϼ���. (c: �߰�, r:��Ϻ���, u:����, d:����, q:�ڷΰ���)");
					inManageMenu = sc.nextLine();
					switch(inManageMenu) {
					case "c":
						menu.appendMenu(sc);
						break;
					case "r":
						menu.showMenu();
						break;
					case "u":
						menu.changeMenu(sc);
						break;
					case "d":
						menu.deleteMenu(sc);
						break;
					}
					
				}while(!inManageMenu.equals("q"));
				menu.save();
				break;
			case "o", "O":
				System.out.println("�ֹ�����");
				Order order = new Order();
				order.manageOrder(sc);
				break;
			case "s", "S":
				System.out.println("��������");
				break;
			case "x", "X":
				System.out.println("���α׷��� �����Ǿ����ϴ�.");
				sc.close();
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		}
	}
}
