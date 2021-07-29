import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
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
	
}
