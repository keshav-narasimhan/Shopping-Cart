package ShoppingCart;
import java.util.ArrayList;
import java.util.List;

public class Catalog 
{
	List<Item> items = new ArrayList<>();;
	String name;
	
	public Catalog(String name)
	{
		this.name = name;
	}

	public void add (Item item)
	{
		items.add(item);
	}
	
	public int size()
	{
		return items.size();
	}
	
	public Item get (int index)
	{
		return items.get(index);
	}
	
	public String getName()
	{
		return this.name;
	}
}
