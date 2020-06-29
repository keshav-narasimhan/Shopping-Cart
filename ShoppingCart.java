package ShoppingCart;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
	List <ItemOrder> itemOrders;
	
	public ShoppingCart()
	{
		itemOrders = new ArrayList<>();
	}
	
	public void add(ItemOrder newOrder)
	{
		if (itemOrders.contains(newOrder))
		{
			itemOrders.remove(newOrder);
		}
		itemOrders.add(newOrder);
	}
	
	public double getTotal()
	{
		double total = 0.0;
		
		for (int index = 0; index < itemOrders.size(); index++)
		{
			total += itemOrders.get(index).getPrice() * itemOrders.get(index).qty; // * itemOrders.get(index).qty;
		}
		
		return total;
	}

}
