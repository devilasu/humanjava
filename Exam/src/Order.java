

import java.util.ArrayList;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal;
	
	void addOrder(String mobile, String menu, int count, int total) {
		this.alMobile.add(mobile);
		this.alMenu.add(menu);
		this.alCount.add(count);
		this.alTotal.add(total);
	}

	
	void showOrder() {
		for(int i = 0 ; i<alMobile.size();i++)
			System.out.println(String.format("%10s%10s%10d%10d",this.alMobile.get(i),this.alMenu.get(i),this.alCount.get(i),this.alTotal.get(i)));
	}
}
