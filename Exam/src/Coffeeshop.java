
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		//m: �޴�����
		//o: �ֹ��ޱ�
		//s: ��������
		//x: ���α׷� ����
		String inMenu;
		while(true) {
			System.out.println("�۾��� �����ϼ��� (m:�޴�����, o:�ֹ�����, s:��������, x:���α׷�����)");;
			inMenu = s.nextLine();
			String newName, nIdx, newPrice;
			switch(inMenu) {
			case "m", "M":
				System.out.println("�޴�����");
				String inManageMenu;
				do{
					System.out.println("�޴��۾��� �����ϼ���. (c: �߰�, r:��Ϻ���, u:����, d:����, q:�ڷΰ���)");
					inManageMenu = s.nextLine();
					switch(inManageMenu) {
					case "c":
						System.out.print("�޴��̸�: ");
						String tmpName = s.nextLine();
						System.out.print("����: ");
						menu.addName(tmpName);
						menu.addPrice(Integer.parseInt(s.nextLine()));
						break;
					case "r":
						menu.showMenu();
						break;
					case "u":
						menu.showMenu();
						System.out.println("������Ʈ�� ��ȣ�� �Է��ϼ���.");;
						nIdx = s.nextLine();
						System.out.print("���ο� �̸�: ");
						newName = s.nextLine();
						System.out.print("���ο� ����: ");
						newPrice = s.nextLine();
						menu.updateMenu(nIdx, newName, newPrice);
						break;
					case "d":
						System.out.println("������ ��ȣ�� �Է��ϼ���.");;
						menu.deleteMenu(s.nextLine());
						break;
					}
				}while(!inManageMenu.equals("q"));
				menu.save(menu.getName(), menu.getPrice());
				break;
			case "o", "O":
				
				System.out.println("�ֹ�����");
				break;
			case "s", "S":
				System.out.println("��������");
				break;
			case "x", "X":
				System.out.println("���α׷��� �����Ǿ����ϴ�.");
				s.close();
				return;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		}
	}
}
