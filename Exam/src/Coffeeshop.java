
import java.util.Scanner;

public class Coffeeshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Menu menu = new Menu();
		//m: 메뉴관리
		//o: 주문받기
		//s: 실적보기
		//x: 프로그램 종료
		String inMenu;
		while(true) {
			System.out.println("작업을 선택하세요 (m:메뉴관리, o:주문관리, s:실적관리, x:프로그램종료)");;
			inMenu = s.nextLine();
			String newName, nIdx, newPrice;
			switch(inMenu) {
			case "m", "M":
				System.out.println("메뉴관리");
				String inManageMenu;
				do{
					System.out.println("메뉴작업을 선택하세요. (c: 추가, r:목록보기, u:수정, d:삭제, q:뒤로가기)");
					inManageMenu = s.nextLine();
					switch(inManageMenu) {
					case "c":
						System.out.print("메뉴이름: ");
						String tmpName = s.nextLine();
						System.out.print("가격: ");
						menu.addName(tmpName);
						menu.addPrice(Integer.parseInt(s.nextLine()));
						break;
					case "r":
						menu.showMenu();
						break;
					case "u":
						menu.showMenu();
						System.out.println("업데이트할 번호를 입력하세요.");;
						nIdx = s.nextLine();
						System.out.print("새로운 이름: ");
						newName = s.nextLine();
						System.out.print("새로운 가격: ");
						newPrice = s.nextLine();
						menu.updateMenu(nIdx, newName, newPrice);
						break;
					case "d":
						System.out.println("제거할 번호를 입력하세요.");;
						menu.deleteMenu(s.nextLine());
						break;
					}
				}while(!inManageMenu.equals("q"));
				menu.save(menu.getName(), menu.getPrice());
				break;
			case "o", "O":
				
				System.out.println("주문관리");
				break;
			case "s", "S":
				System.out.println("실적보기");
				break;
			case "x", "X":
				System.out.println("프로그램이 종룓되었습니다.");
				s.close();
				return;
			default:
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		}
	}
}
