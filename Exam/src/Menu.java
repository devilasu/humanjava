
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Menu {
	private ArrayList<String> alName;
	private ArrayList<Integer> alPrice;
	
	Menu(){
		init();
	}
	
	void init() {
		this.alName = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		
		try {
			this.load();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<String> getName() {
		return this.alName;
	}
	public void addName(String name) {
		this.alName.add(name);
	}
	public ArrayList<Integer> getPrice() {
		return this.alPrice;
	}
	public void addPrice(Integer price) {
		this.alPrice.add(price);
	}
	
	public void addPrice(String price) {
		this.alPrice.add(Integer.parseInt(price));
	}
	
	public void updateMenu(int idx, String newName, Integer newPrice) {
		this.alName.set(idx, newName);
		this.alPrice.set(idx, newPrice);
	}
	public void updateMenu(String idx, String newName, String newPrice) {
		int nIdx = Integer.parseInt(idx);
		int nPrice = Integer.parseInt(newPrice);
		this.alName.set(nIdx-1, newName);
		this.alPrice.set(nIdx-1, nPrice);
	}
	
	public void deleteMenu(String idx) {
		int nIdx = Integer.parseInt(idx);
		this.alName.remove(nIdx-1);
		this.alPrice.remove(nIdx-1);
	}
	
	public void showMenu() {
		for(int i = 1 ; i<=this.alName.size();i++) {
			System.out.println(i+". "+String.format("%-10s\t%d",this.alName.get(i-1),this.alPrice.get(i-1)));
		}
	}
	
	void save(){
		try {
		FileWriter fw = new FileWriter("d:/study/humanjava/menu.txt");
		for(int i = 0 ; i< this.alName.size();i++)
		fw.write(this.alName.get(i)+","+this.alPrice.get(i)+"\n");
		fw.close();
		} catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	void load(){
		try {
			BufferedReader br = new BufferedReader(new FileReader("d:/study/humanjava/menu.txt"));
			String line;
			while(true) {
				line = br.readLine();
				if(line==null || line.isBlank())
					break;
				String[] parts = line.split(",");
				this.addName(parts[0]);
				this.addPrice(parts[1]);
			}		
			br.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
