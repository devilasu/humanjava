package menu;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
		} catch (IOException e) {
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
	
	public void showMenu() {
		for(int i = 0 ; i<this.alName.size();i++) {
			System.out.print(this.alName.get(i)+"\t");
			System.out.println(this.alPrice.get(i));
		}
	}
	
	void save(ArrayList<String> alName, ArrayList<Integer> alPrice){
		try {
		FileWriter fw = new FileWriter("e:/humanjava/menu.txt");
		for(int i = 0 ; i< alName.size();i++)
		fw.write(alName.get(i)+","+alPrice.get(i)+"\n");
		fw.close();
		} catch(Throwable e) {
			e.printStackTrace();
		}
	}
	
	void load() throws IOException{
		try {
			BufferedReader br = new BufferedReader(new FileReader("e:/humanjava/menu.txt"));
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
