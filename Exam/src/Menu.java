
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
	
	public void appendMenu(Scanner s) {
		String tmpName, tmpPrice;
		System.out.print("메뉴이름: ");
		tmpName = s.nextLine();
		if(tmpName.isBlank()) {
		//	s.close();
			return;
		}
			
		System.out.print("가격: ");
		tmpPrice = s.nextLine();
		this.addName(tmpName);
		this.addPrice(Integer.parseInt(tmpPrice));
	//	s.close();
	}
	
	public void updateMenu(Scanner s) {
		this.showMenu();
		String nIdx, newName, newPrice;
		System.out.println("업데이트할 번호를 입력하세요.");;
		nIdx = s.nextLine();
		System.out.print("새로운 이름: ");
		newName = s.nextLine();
		System.out.print("새로운 가격: ");
		newPrice = s.nextLine();
		
		this.alName.set(Integer.parseInt(nIdx)-1, newName);
		this.alPrice.set(Integer.parseInt(nIdx)-1, Integer.parseInt(newPrice));
	//	s.close();
	}
	
	public void deleteMenu(Scanner s) {
		System.out.println("제거할 번호를 입력하세요.");;
		int nIdx = Integer.parseInt(s.nextLine());
		
		this.alName.remove(nIdx-1);
		this.alPrice.remove(nIdx-1);
	//	s.close();
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
