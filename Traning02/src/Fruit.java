
public class Fruit {
	private String name;
	private String color;
	private String weight;
	private String origin;
	private int price;
	public Fruit(String name, String color, String weight, String origin, int price) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
