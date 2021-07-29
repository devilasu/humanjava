import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	void init() {
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
	}
	
	public String getName(int i) {
		return alName.get(i);
	}
	public void addName(String name) {
		alName.add(name);
	}
	public Integer getPrice(int i) {
		return alPrice.get(i);
	}
	public void addPrice(Integer price) {
		alPrice.add(price);
	}
	
	public void showMenu() {
		for(int i = 0 ; i<alName.size();i++) {
			System.out.print(this.alName.get(i)+" ");
			System.out.println(this.alPrice.get(i));
		}
	}
	
}
