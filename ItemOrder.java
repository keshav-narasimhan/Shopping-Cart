package ShoppingCart;
public class ItemOrder 
{
	Item item;
	int qty;
	
	public ItemOrder (Item item, int qty)
	{
		this.item = item;
		this.qty = qty;
	}
	
	public double getPrice()
	{
		if (this.item.bulkOty > 0 && this.qty >= this.item.bulkOty)
			return this.item.bulkPrice;
			
		return this.item.price;
	}
	
	public Item getItem()
	{
		return this.item;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		ItemOrder temp = (ItemOrder)obj;
		return this.item == temp.item;
	}

}
