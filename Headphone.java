import java.util.ArrayList;
import java.util.List;

public class Headphone {
	//private fields
	private String brand;
	private double price;
	private boolean isWired;
	private List<String> specifications;
	

	// Constructor. Source -> Generate Constructor using Fields...
	public Headphone(String brand, double price, boolean isWired, List<String> specifications) {
		this.brand = brand;
		this.price = price;
		this.isWired = isWired;
		this.specifications = specifications;
	}
	
	// Constructor. Source -> Generate Constructor using Fields...
		public Headphone(String brand, double price, boolean isWired) {
			this.brand = brand;
			this.price = price;
			this.isWired = isWired;
			this.specifications = new ArrayList<>();
		}
	
	// Constructor
	public Headphone(String brand) {
		this.brand = brand;
		this.specifications = new ArrayList<>();
	}
	
	// Getters and setters. Source -> Generate Getters and Setters
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the isWired
	 */
	public boolean isWired() {
		return isWired;
	}
	/**
	 * @param isWired the isWired to set
	 */
	public void setWired(boolean isWired) {
		this.isWired = isWired;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	
	@Override
	public String toString() {
		return "Headphone [" + (brand != null ? "brand=" + brand + ", " : "") + "price=" + price + ", isWired="
				+ isWired + ", " + (specifications != null ? "specifications=" + specifications : "") + "]";
	}
	
	public boolean isExpensive() {
		return price > 100;
	}
	
	public String isExpensiveString() {
		return isExpensive() ? "kallis" : "odav"; 
	}
	public String ClassNumberRoom() {
		String Room = null;
		return Room;
		
	}
	
	public void addSpecification(String spec) {
		this.specifications.add(spec);
	}
}