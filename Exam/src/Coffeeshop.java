
import java.util.Scanner;

public class Coffeeshop {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		//m: 메뉴관리
		//o: 주문받기
		//s: 실적보기
		//x: 프로그램 종료
		String inMenu;
		while(true) {
			System.out.println("작업을 선택하세요 (m:메뉴관리, o:주문관리, s:실적관리, x:프로그램종료)");;
			
			inMenu = sc.nextLine();
			switch(inMenu) {
			case "m", "M":
				System.out.println("메뉴관리");
				String inManageMenu;
				do{
					System.out.println("메뉴작업을 선택하세요. (c: 추가, r:목록보기, u:수정, d:삭제, q:뒤로가기)");
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
				System.out.println("주문관리");
				Order order = new Order();
				order.manageOrder(sc);
				break;
			case "s", "S":
				System.out.println("실적보기");
				break;
			case "x", "X":
				System.out.println("프로그램이 종룓되었습니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
	}
}
