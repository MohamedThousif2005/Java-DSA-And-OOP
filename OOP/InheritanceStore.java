package Inheritance;

class Product {
     String id;
     String name;
     double price;
	 public Product(String id, String name, double price) 
	 {
		this.id = id;
		this.name = name;
		this.price = price;
	 }
	 public String getDetails()
	 {
		 return "ID: "+id+" | Name: "+name+" | Price: $"+price;
	 }
}

class Electronics extends Product{
	String brand;
	int warrantyMonths;
	public Electronics(String id, String name, double price, String brand, int warrantyMonths)
	{
		super(id, name, price);
		this.brand = brand;
		this.warrantyMonths = warrantyMonths;
	}
	@Override
	public String getDetails()
	 {
		return super.getDetails() + " | Brand: "+brand+" | Warranty: "+warrantyMonths+" months";
	 }
}

class Clothing extends Product{
	String size;
	String fabric;
	
	public Clothing(String id, String name, double price, String size, String fabric) 
	{
		super(id, name, price);
		this.size = size;
		this.fabric = fabric;
	}
	@Override
	public String getDetails()
	 {
		 return super.getDetails() + " | Size: "+size+" | Fabric: "+fabric;
	 }
}

class Smartphone extends Electronics{
	int storageGB;
	int cameraMP;
	
	public Smartphone(String id, String name, double price, String brand, int warrantyMonths, int storageGB, int cameraMP) 
	{
		super(id, name, price, brand, warrantyMonths);
		this.storageGB = storageGB;
		this.cameraMP = cameraMP;
	}
	@Override
	public String getDetails()
	{
		return super.getDetails() + " | Storage: "+storageGB+"GB | Camera: "+cameraMP+"MP";
	}
}

public class Store{
	public static void main(String[] args) {
		Product c = new Clothing("102", "Graphic Tree", 25.0, "L", "Polyeseter");
		Electronics e = new Smartphone("103", "Pixel 8", 699.0, "Google", 12, 128, 50);
		System.out.println(c.getDetails());
		System.out.println(e.getDetails());
	}
}
