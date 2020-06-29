package ShoppingCart;
public class ShoppingMain 
{
    public static void main(String[] args)
    {
        Catalog list = new Catalog("Keshav's Random Shop");

        list.add(new Item("5 Pack of Pencils", 3.95));
        list.add(new Item("Sandwich", 3.50));
        list.add(new Item("Burger", 3.75));
        list.add(new Item("Deluxe Burger", 4.0, 10, 3.85));
        list.add(new Item("One dollar", 0.01));
        list.add(new Item("Answers to next test", 500));
        list.add(new Item("New Ferrari", 10));
        list.add(new Item("Used 1990s Toyota Camry", 100000));
        list.add(new Item("Geeky CS pen", 3.40));
        list.add(new Item("Rubik's cube", 9.15));
        list.add(new Item("Life, the universe, everything", 42));

        ShoppingFrame f = new ShoppingFrame(list);
        f.setVisible(true);
    }
}
