import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	Menu menu = new Menu();
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal;
	
	Order(){
		this.init();
	}
	
	void init() {
		this.alMobile = new ArrayList<String>();
		this.alMenu = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alTotal = new ArrayList<Integer>();
	}
	
	void manageOrder(Scanner sc) {
		String menuName;
		int totalPrice;
		String mobileNum;
		menu.showMenu();
		do {
		System.out.print("�޴���ȣ: ");
		menuName = sc.nextLine();

		if(menuName.isBlank()) {	//����κ�
			System.out.println("��ü �Ѿ�: "+this.getTotalSum());
			System.out.println("����� ��ȣ�� �Է��ϼ���.");
			mobileNum=sc.nextLine();
			for(int i = this.alMobile.size(); i<this.alMenu.size();i++)
				this.addMobile(mobileNum);
			this.showOrder();
			break;
		}
		System.out.print("����: ");
		totalPrice = this.addOrder(menuName, sc.nextLine());
		System.out.println("�Ѿ�: "+totalPrice);
		}while(true);
	}
	
	int addOrder(String name, String cnt) {
		this.addMenu(menu.getName(name));
		this.addCount(cnt);
		int price= menu.getPrice(name);
		int total = 0;
		total = price*Integer.parseInt(cnt);
		this.addTotalPrice(total);
		return total;
	}
	
	int getTotalSum() {
		int totalSum=0;
		for(int sum:this.alTotal)
			totalSum+=sum;
		return totalSum;
	}
	
	void addMobile(String mobile) {
		this.alMobile.add(mobile);
	}
	
	void addMenu(String menu) {
		this.alMenu.add(menu);
	}
	
	void addCount(String cnt) {
		this.alCount.add(Integer.parseInt(cnt));
	}
	
	void addTotalPrice(Integer total) {
		this.alTotal.add(total);
	}
	
	void showOrder() {
		for(int i = 0 ; i<this.alMobile.size();i++){
		System.out.println(String.format("%-10s%-15s%-5d%d",this.alMobile.get(i),this.alMenu.get(i),this.alCount.get(i),this.alTotal.get(i)));
		}
	}
}
