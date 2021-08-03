

import java.util.ArrayList;

public class Order {
	ArrayList<String> alMobile;
	ArrayList<String> alMenu;
	ArrayList<Integer> alCount;
	ArrayList<Integer> alTotal;
	
	void addOrder(String mobile, String menu, int count, int total) {
		alMobile.add(mobile);
		alMenu.add(menu);
		alCount.add(count);
		alTotal.add(total);
		
	}
}
