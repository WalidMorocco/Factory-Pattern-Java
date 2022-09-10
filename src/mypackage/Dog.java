package mypackage;

public abstract class Dog {
	String race;
	String size;
	String color;
	
	void bark() {
		System.out.println("Woo! Woo!");
	}
	
	void growl() {
		System.out.println("Grrr!");
	}
	
	public String getRace() {
		return race;
	}
	
	public String getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
