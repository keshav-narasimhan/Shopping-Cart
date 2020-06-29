package ShoppingCart;

public class Item 
{
	String name;
	double price;
	int bulkOty;
	double bulkPrice;
	
	public Item (String name, double price)
	{
		this(name, price, 0, 0.0);
	}
	
	public Item (String name, double price, int bulkOty, double bulkPrice)
	{
		this.name = name;
		this.price = price;
		this.bulkOty = bulkOty;
		this.bulkPrice = bulkPrice;
		
		if(this.price < 0 || this.bulkOty < 0 || this.bulkOty < 0)
			throw new IllegalArgumentException("Error!");
	}
	
	public double priceFor (int quantity)
	{
		if (quantity < 0)
			throw new IllegalArgumentException("Error!");
		return this.bulkPrice * quantity;
	}
	
	@Override
	public String toString()
	{
		String ret = "Name: " + this.name + ", Price: " + this.price;
		if (this.bulkPrice > 0)
			ret += " (Quantity: " + this.bulkOty + " for Bulk Price: " + this.bulkPrice + ")";
		return ret;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Item temp = (Item)obj;
		return this.name == temp.name;
	}
	
}
